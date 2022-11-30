/*
* Classe conceitual para aula de conexão com banco MySQL via JDBC
* Esta classe possui as operações básicas de um CRUD para os dados da tabela Estudantes
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
* 
*/
import java.sql.*;
import java.util.*;

public class CRUDEstudante {
    
    public Connection conexao;
    
    CRUDEstudante(Connection conexao){
        this.conexao = conexao;
    }
    
    public void inserirNovoEstudante(String estudanteNome, String estudanteRGA){
        String inserirRegistro = "INSERT INTO estudantes (estudanteNome, estudanteRGA) values (?,?)";

        try{
            PreparedStatement consultaPreCompilada = this.conexao.prepareStatement(inserirRegistro);
    
            consultaPreCompilada.setString(1,estudanteNome);
            consultaPreCompilada.setString(2,estudanteRGA);

            consultaPreCompilada.executeUpdate();
    
            System.out.println("Registro inserido com sucesso!");
        } catch(SQLException e) {

            e.printStackTrace();

        }
    }
    
    public void excluirEstudantePorNome(String estudanteNome){
        String excluirRegistro = "DELETE FROM estudantes WHERE estudanteNome=?";

        try{
            PreparedStatement consultaPreCompilada = this.conexao.prepareStatement(excluirRegistro);
    
            consultaPreCompilada.setString(1,estudanteNome);
            

            consultaPreCompilada.executeUpdate();
    
            System.out.println("Registro excluído com sucesso!");
        } catch(SQLException e) {

            e.printStackTrace();

        }
    }

    public void excluirEstudantePorRGA(String estudanteRGA){
        String excluirRegistro = "DELETE FROM estudantes WHERE estudanteRGA=?";

        try{
            PreparedStatement consultaPreCompilada = this.conexao.prepareStatement(excluirRegistro);
    
            consultaPreCompilada.setString(1,estudanteRGA);
            

            consultaPreCompilada.executeUpdate();
    
            System.out.println("Registro excluído com sucesso!");
        } catch(SQLException e) {

            e.printStackTrace();

        }
    }

    public void atualizarEstudante(String estudanteNome, String estudanteRGA){
        String atualizar = "UPDATE estudantes SET estudanteNome=? WHERE estudanteRGA=?";

        try{
            PreparedStatement consultaPreCompilada = this.conexao.prepareStatement(atualizar);
    
            consultaPreCompilada.setString(1,estudanteNome);
            consultaPreCompilada.setString(2,estudanteRGA);

            consultaPreCompilada.executeUpdate();
    
            System.out.println("Registro alterado com sucesso!");
        } catch(SQLException e) {

            e.printStackTrace();

        }
    }

    public void imprimirEstudantes(){
        String consulta = "SELECT * FROM estudantes";

        try{
            Statement mostrarRegistros = conexao.createStatement();
            ResultSet registros = mostrarRegistros.executeQuery(consulta);

            while (registros.next()) {
                int id = registros.getInt("estudantesID");
                String nome = registros.getString("estudanteNome");
                String rga = registros.getString("estudanteRGA");
                System.out.println(id + ", " + nome + ", " + rga);
            }
        } catch(SQLException e) {

            e.printStackTrace();

        }
    }

    public List<Estudante> getEstudantes(){
        List<Estudante> estudantes = new ArrayList<Estudante>();
        String consulta = "SELECT * FROM estudantes";

        try{
            Statement mostrarRegistros = conexao.createStatement();
            ResultSet registros = mostrarRegistros.executeQuery(consulta);

            while (registros.next()) {
                Estudante e = new Estudante(registros.getString("estudanteNome"),registros.getString("estudanteRGA"));
                estudantes.add(e);

            }
            
        } catch(SQLException e) {

            e.printStackTrace();

        }

        return estudantes;
    }

}
