/*
* Classe conceitual para aula de conexão com banco MySQL via JDBC
* Esta classe representa o Objeto Estudante que será utilizado para acolher os dados da tabela Estudantes
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
* 
*/
public class Estudante {
    private String nome, RGA;

    Estudante(String nome, String RGA) {
        this.setNome(nome);
        this.setRGA(RGA);   
    }

    public String getRGA() {
        return RGA;
    }

    public void setRGA(String RGA) {
        this.RGA = RGA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
