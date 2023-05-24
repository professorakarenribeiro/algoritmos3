// Esta é a classe DAO de Estudante JDBC e faz parte do Model
package model;

//imports Java
import java.sql.*;
import java.util.ArrayList;

public class EstudanteDAOImpl implements EstudanteDAO {

    public Connection conexao;

    public EstudanteDAOImpl(Connection conexao) {
        this.conexao = conexao; // conexão com Banco
    }

    // implementação dos métodos da interface EstudanteDAO para JDBC/SQL
    @Override
    public void inserir(Estudante estudante) {
        String inserir = "INSERT INTO estudantes (estudanteNome, estudanteRGA) values (?,?)";
        try {
            PreparedStatement statementInserir = this.conexao.prepareStatement(inserir);

            statementInserir.setString(1, estudante.getNome());
            statementInserir.setString(2, estudante.getRGA());
            statementInserir.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizar(Estudante estudante, String nome) {
        String atualizar = "UPDATE estudantes SET estudanteNome=? WHERE estudanteRGA=?";
        try {
            PreparedStatement statementAtualizar = this.conexao.prepareStatement(atualizar);
            statementAtualizar.setString(1, nome);
            statementAtualizar.setString(2, estudante.getRGA());
            statementAtualizar.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void excluir(String RGA) {
        Estudante estudante = this.buscarPorRGA(RGA);
        if (estudante != null) {
            String excluir = "DELETE FROM estudantes WHERE estudanteRGA=" + RGA;
            try {
                PreparedStatement statementExcluir = this.conexao.prepareStatement(excluir);
                statementExcluir.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Estudante buscarPorRGA(String RGA) {
        String buscarPorRGA = "SELECT * FROM estudantes WHERE estudanteRGA=" + RGA;
        Estudante estudante = null;
        try {
            Statement statementBuscarPorRGA = this.conexao.createStatement();
            ResultSet registros = statementBuscarPorRGA.executeQuery(buscarPorRGA);
            if (registros.next()) {
                estudante = new Estudante(registros.getString("estudanteNome"), registros.getString("estudanteRGA"));
            } else {
                System.out.println("Estudante não encontrado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudante;
    }

    @Override
    public ArrayList<Estudante> buscarTodos() {
        String buscarTodos = "SELECT * FROM estudantes";
        ArrayList<Estudante> listaEstudantes = new ArrayList<Estudante>();
        try {
            Statement statementBuscarTodos = this.conexao.createStatement();
            ResultSet registros = statementBuscarTodos.executeQuery(buscarTodos);
            while (registros.next()) {
                Estudante estudante = new Estudante(registros.getString("estudanteNome"),
                        registros.getString("estudanteRGA"));
                listaEstudantes.add(estudante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaEstudantes;
    }
}