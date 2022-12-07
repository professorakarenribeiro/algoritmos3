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
