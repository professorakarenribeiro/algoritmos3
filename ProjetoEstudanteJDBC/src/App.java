// Este projeto realiza o CRUD da tabela Estudante usando JDBC sem nenhuma classe conceitual ou padrão. Ou seja, funciona, mas não é o recomendado.

import java.sql.*;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, meu projeto CRUD Estudante JDBC!");

        // organizar seus dados de conexão em strings é uma boa ideia!
        String mySQLURL = "jdbc:mysql://localhost:3306/BDalg3"; // Informar o nome do banco no final da URL é opcional
        String usuario = "root";
        String senha = "123456";

        // realiza a conexão com o banco
        try (Connection conexao = DriverManager.getConnection(mySQLURL, usuario, senha)) {

            if (conexao != null) {
                System.out.println("Conectado com sucesso à instância MySQL!");
            }

            //Testando os métodos CRUD...
            mostrarEstudantes(conexao);
            inserir(conexao, "Ada Lovelace da Silva", "202311310001");
            inserir(conexao, "Grace Santos", "202311310002");
            mostrarEstudantes(conexao);
            atualizar(conexao, 2, "Grace Hopper Santos", "202311310002");
            mostrarEstudantes(conexao);
            excluir(conexao, 1);
            mostrarEstudantes(conexao);

            conexao.close(); // fecha a conexão com o banco - sempre fechar após o uso!

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    
    // métodos CRUD da tabela Estudante
    public static void inserir(Connection conexao, String nome, String rga) {
        String inserirRegistro = "INSERT INTO estudantes (estudanteNome, estudanteRGA) values (?,?)";
        try {
            PreparedStatement prepararConsulta = conexao.prepareStatement(inserirRegistro);
            prepararConsulta.setString(1, nome);
            prepararConsulta.setString(2, rga);

            int linhasInseridas = prepararConsulta.executeUpdate();
            if (linhasInseridas > 0) {
                System.out.println("Registro inserido com sucesso!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void atualizar(Connection conexao, int id, String nome, String rga) {
        String atualizar = "UPDATE estudantes SET estudanteNome=?, estudanteRGA=? WHERE estudanteID=?";
        try {
            PreparedStatement statementAtualizar = conexao.prepareStatement(atualizar);
            statementAtualizar.setString(1, nome);
            statementAtualizar.setString(2, rga);
            statementAtualizar.setInt(3, id);

            int linhasAtualizadas = statementAtualizar.executeUpdate();
            if (linhasAtualizadas > 0) {
                System.out.println("Registro atualizado com sucesso!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void excluir(Connection conexao, int id) {
        String excluir = "DELETE FROM estudantes WHERE estudanteID=?";
        try {
            PreparedStatement statementExcluir = conexao.prepareStatement(excluir);
            statementExcluir.setInt(1, id);

            int linhasExcluidas = statementExcluir.executeUpdate();
            if (linhasExcluidas > 0) {
                System.out.println("Registro excluído com sucesso!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void mostrarEstudantes(Connection conexao) {
        String mostrarEstudantes = "SELECT * FROM estudantes";
        try {
            Statement statementMostrarEstudantes = conexao.createStatement();
            ResultSet registros = statementMostrarEstudantes.executeQuery(mostrarEstudantes);

            while (registros.next()) {
                int id = registros.getInt("estudanteID");
                String nome = registros.getString("estudanteNome");
                String rga = registros.getString("estudanteRGA");
                System.out.println(id + ", " + nome + ", " + rga);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}