/*
* Classe principal para aula de conexão com banco MySQL via JDBC
* 
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
* 
*/
import java.sql.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, JDBC!");

        String mySQLURL = "jdbc:mysql://localhost:3306/";
        String usuario = "root";
        String senha = "123456";

        try (Connection conexao = DriverManager.getConnection(mySQLURL, usuario, senha)) {
            if (conexao != null) {
                System.out.println("Conectado à instância MySQL!");
            }

            BancoMySQL testeBD = new BancoMySQL(conexao, "teste1");
            //testeBD.criarNovoBanco(conexao, "teste2");
            
            testeBD.usarBanco(conexao, "teste1");
            
            TabelaMySQL testeTabela = new TabelaMySQL(conexao, "estudantes");
            //testeTabela.criarNovaTabela(conexao, "disciplinas");
            //testeTabela.excluirTabela(conexao, "disciplinas");

            testeTabela.alterarTabela(conexao, "estudantes", "ADD estudanteNome VARCHAR(255), ADD estudanteRGA VARCHAR(255)");

            CRUDEstudante crud = new CRUDEstudante(conexao);
            crud.inserirNovoEstudante("João Silva", "202211310001");
            crud.inserirNovoEstudante("Maria Ribeiro", "202211310002");

            crud.imprimirEstudantes();
            
            //impressão via LISTA 
            System.out.println("----------LISTA DE ESTUDANTES:----------");
            Iterator<Estudante> iterator = crud.getEstudantes().iterator();
            while (iterator.hasNext()) {
                Estudante e = iterator.next();
                System.out.println("NOME: "+ e.getNome()+" , RGA: "+e.getRGA());
            }

            crud.atualizarEstudante("José Sousa", "202211310001");
            
            crud.imprimirEstudantes();
            
            crud.excluirEstudantePorNome("João Silva");
            crud.excluirEstudantePorRGA("202211310002");

            crud.imprimirEstudantes();
            
            //testeTabela.excluirTabela(conexao, "estudantes");

            //testeBD.excluirBanco(conexao, "teste1");
            //testeBD.excluirBanco(conexao, "teste2");
            
            conexao.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}