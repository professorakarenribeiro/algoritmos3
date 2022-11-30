/*
* Classe conceitual para aula de conexão com banco MySQL via JDBC
* Esta classe possui as operações básicas criação de um BANCO DE DADOS via Java
* Se o banco já tiver sido criado, esta classe é desnecessária
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
* 
*/
import java.sql.*;

public class BancoMySQL {

    BancoMySQL(Connection conexao, String nomeBD){
        try(Statement consulta = conexao.createStatement()){

            String criarBanco = "CREATE database " + nomeBD + ";";

            consulta.executeUpdate(criarBanco);

            System.out.println("Banco " + nomeBD + " criado com sucesso!");

        } catch(SQLException e) {

            e.printStackTrace();

        }
    }

    public void criarNovoBanco(Connection conexao, String nomeBD){
        try(Statement consulta = conexao.createStatement()){

            String criarBanco = "CREATE database " + nomeBD + ";";

            consulta.executeUpdate(criarBanco);

            System.out.println("Banco " + nomeBD + " criado com sucesso!");

        } catch(SQLException e) {

            e.printStackTrace();

        }
    }

    public void usarBanco(Connection conexao, String nomeBD){
        try(Statement consulta = conexao.createStatement()){

            String usarBanco = "USE " + nomeBD + ";";

            consulta.executeUpdate(usarBanco);

            System.out.println("Usando banco " + nomeBD);

        } catch(SQLException e) {

            e.printStackTrace();

        }
    }

    public void excluirBanco(Connection conexao, String nomeBD){
        try(Statement consulta = conexao.createStatement()){

            String excluirBanco = "DROP DATABASE " + nomeBD + ";";

            consulta.executeUpdate(excluirBanco);

            System.out.println(nomeBD + " excluído com sucesso!");

        } catch(SQLException e) {

            e.printStackTrace();

        }
    }

}
