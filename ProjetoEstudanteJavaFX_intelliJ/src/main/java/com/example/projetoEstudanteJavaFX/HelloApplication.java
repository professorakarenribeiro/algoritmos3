package com.example.projetoEstudanteJavaFX;

//Imports dos pacotes MVC
import com.example.projetoEstudanteJavaFX.View.EstudanteCRUDView;

// Imports JavaFX
import javafx.application.Application;
import javafx.stage.Stage;

// Outros imports
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

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