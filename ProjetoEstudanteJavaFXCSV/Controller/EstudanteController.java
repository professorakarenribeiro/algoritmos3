// Esta é a classe controladora das operações do CRUD de Estudante. Ela usa o modelo de Estudante para manipular os dados e persistir no arquivo CSV via o gerenciador de dados CSVHandler.
package Controller;

//Imports dos pacotes MVC
import Model.Estudante;
import Model.CSVHandler;

// Imports JavaFX
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

// Outros imports
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EstudanteController {
    private ObservableList<Estudante> listaDadosEstudantes; // Cria uma lista de dados do tipo Estudante
    public CSVHandler CSVHandler; // Cria uma instância do gerenciador de dados CSVHandler

    public EstudanteController() {
        CSVHandler = new CSVHandler(); // Instancia o gerenciador de dados CSVHandler
        listaDadosEstudantes = FXCollections.observableArrayList(); // Cria uma lista observable de dados do tipo Estudante
        CSVHandler.carregarDadosCSV(); // Carrega os dados do arquivo CSV 
    }

    public ObservableList<Estudante> getListaDadosEstudantes() { // Obtém a lista de dados do tipo Estudante
        return listaDadosEstudantes;
    }

    public void cadastrarEstudante(Estudante estudante) { // Cadastra um novo estudante na lista de dados
        listaDadosEstudantes.add(estudante);
        CSVHandler.salvarDadosCSV(); // Salva os dados no arquivo CSV
    }

    public void excluirEstudante(Estudante estudante) { // Exclui um estudante da lista de dados
        listaDadosEstudantes.remove(estudante);
        CSVHandler.salvarDadosCSV(); // Salva os dados no arquivo CSV
    }

    public void atualizarEstudante(int i, Estudante estudante) { // Atualiza um estudante da lista de dados
        listaDadosEstudantes.set(i, estudante);
        CSVHandler.salvarDadosCSV(); // Salva os dados no arquivo CSV
    }
}
