// Esta é a classe principal do sistema responsável por inicializar a aplicação a partir da interface

//Imports dos pacotes MVC
import Model.Estudante;
import View.EstudanteCRUDView;

// Imports JavaFX
import javafx.application.Application;
import javafx.stage.Stage;

// Outros imports
import java.io.IOException;


public class Main extends Application { // A classe principal deve estender a classe Application

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
        launch(); // carrega a aplicação
    }

}