package com.mycompany.projetoestudantejavafx;

//Imports dos pacotes MVC
import com.mycompany.projetoestudantejavafx.Model.Estudante;
import com.mycompany.projetoestudantejavafx.View.EstudanteCRUDView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        // Cria instância da tela/cena da interface de CRUD de Estudante
        EstudanteCRUDView ec = new EstudanteCRUDView();

        // Propriedades do palco onde a aplicação acontece
        stage.setTitle("Projeto CRUD Estudante com JavaFX"); // Título do palco
        stage.setScene(ec.getScene()); // Tela/cena a ser carregada ao iniciar o palco
        stage.show(); // Inicia o palco
    }

    public static void main(String[] args) {
        launch();
    }

}
