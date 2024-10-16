/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoestudantejavafx.Model;

/**
 *
 * @author Karen
 */
// Imports JavaFX
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

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

    // Criação de métodos para obter dados observáveis (properties) a partir do modelo
    public StringProperty nomeProperty() {
        return new SimpleStringProperty(this.getNome());
    }

    public StringProperty RGAProperty() {
        return new SimpleStringProperty(this.getRGA());
    }
}
