/*
* Classe conceitual para aula de conexão com banco MySQL via JDBC
* Esta classe possui as operações básicas criação de TABELAS em um BANCO DE DADOS via Java
* Se as tabelas que você irá trabalhar já tiverem sido criadas, esta classe é desnecessária
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
* 
*/
import java.sql.*;

public class TabelaMySQL {
    TabelaMySQL(Connection conexao, String nomeTabela){
        try(Statement consulta = conexao.createStatement()){

            String criarTabela = "CREATE TABLE " + nomeTabela + " ("+ nomeTabela + "ID INT NOT NULL AUTO_INCREMENT, PRIMARY KEY(" + nomeTabela + "ID));";

            consulta.executeUpdate(criarTabela);

            System.out.println("Tabela " + nomeTabela + " criada com sucesso!");

        } catch(SQLException e) {

            e.printStackTrace();

        }
    }

    public void criarNovaTabela(Connection conexao, String nomeTabela){
        try(Statement consulta = conexao.createStatement()){

            String criarTabela = "CREATE TABLE " + nomeTabela + " ("+ nomeTabela + "ID INT NOT NULL AUTO_INCREMENT, PRIMARY KEY(" + nomeTabela + "ID));";

            consulta.executeUpdate(criarTabela);

            System.out.println("Tabela " + nomeTabela + " criada com sucesso!");

        } catch(SQLException e) {

            e.printStackTrace();

        }
    }
    
    public void alterarTabela(Connection conexao, String nomeTabela, String alteracoes){
        try(Statement consulta = conexao.createStatement()){

            String alterarTabela = "ALTER TABLE " + nomeTabela + " "+ alteracoes + " ;";

            consulta.executeUpdate(alterarTabela);

            System.out.println("Tabela " + nomeTabela + " alterada com sucesso!");

        } catch(SQLException e) {

            e.printStackTrace();

        }
    }
    
    public void excluirTabela(Connection conexao, String nomeTabela){
        try(Statement consulta = conexao.createStatement()){

            String excluirTabela = "DROP TABLE " + nomeTabela + ";";

            consulta.executeUpdate(excluirTabela);

            System.out.println(nomeTabela + " excluída com sucesso!");

        } catch(SQLException e) {

            e.printStackTrace();

        }
    }

}
