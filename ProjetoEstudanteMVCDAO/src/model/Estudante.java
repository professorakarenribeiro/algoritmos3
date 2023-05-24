// Esta é a classe conceitual de Estudante e faz parte do Model
package model;

public class Estudante {
    private String nome, RGA;

    public Estudante(String nome, String RGA) {
        this.setNome(nome);
        this.setRGA(RGA);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRGA() {
        return RGA;
    }

    public void setRGA(String RGA) {
        this.RGA = RGA;
    }
}