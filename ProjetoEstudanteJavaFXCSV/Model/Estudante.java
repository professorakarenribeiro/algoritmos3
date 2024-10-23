// Esta é a classe conceitual de Estudante e também a nossa classe de modelo
package Model;

// Imports JavaFX
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Estudante {
    private String nome, RGA;

    public Estudante(String RGA, String nome) {
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

    // Criação de métodos para obter dados observáveis (properties) a partir do modelo
    public StringProperty nomeProperty() {
        return new SimpleStringProperty(this.getNome());
    }

    public StringProperty RGAProperty() {
        return new SimpleStringProperty(this.getRGA());
    }
}
