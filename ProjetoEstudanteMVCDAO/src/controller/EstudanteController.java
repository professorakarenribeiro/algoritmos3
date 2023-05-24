// Esta é a classe de Controle de Estudante que deve gerenciar a comunicação entre Model e View de Estudante
package controller;

import model.*; // import do Modelo
import view.EstudanteView; // import da Visão

//imports Java
import java.sql.*; 
import java.util.ArrayList;

public class EstudanteController {

    EstudanteDAOImpl estudanteModel;
    EstudanteView estudanteView;

    public EstudanteController(Connection conexao) {
        this.estudanteView = new EstudanteView(); // inicia a Visão de Estudante
        this.estudanteModel = new EstudanteDAOImpl(conexao); // inicia o Model de Estudante
        this.iniciarControle();
    }

    public void iniciarControle() { // controle de funcionalidades CRUD Estudante
        int menu;
        do {
            menu = this.estudanteView.exibirMenu();
            switch (menu) {
                case 1:
                    this.mostrarEstudantes();
                    break;
                case 2:
                    this.inserirEstudante();
                    break;
                case 3:
                    this.atualizarEstudante();
                    break;
                case 4:
                    this.excluirEstudantePorRGA();
                    break;
                case 5:
                    this.pesquisarEstudantePorRGA();
                    break;
                case 0:
                    this.estudanteView.encerrarView();
                    break;
                default:
                    this.estudanteView.opcaoInvalida();
                    break;
            }
        } while (menu != 0);
    }
    
    // métodos de controle do CRUD de Estudante
    public void mostrarEstudantes() {
        ArrayList<Estudante> listaEstudantes = this.estudanteModel.buscarTodos(); // busca no modelo
        this.estudanteView.mostrarEstudantes(listaEstudantes); // mostra na visão
    }

    public void inserirEstudante() {
        this.estudanteView.inserirEstudante(); // mostra na visão
        Estudante estudante = new Estudante(this.estudanteView.getNomeEstudante(), this.estudanteView.getRGAEstudante()); // recebe na visão
        this.estudanteModel.inserir(estudante); // grava no modelo
        this.estudanteView.confirmarInsercaoEstudante(estudante.getRGA()); // mostra na visão
    }

    public void excluirEstudantePorRGA() {
        this.estudanteView.excluirEstudante(); // mostra na visão
        String RGA = this.estudanteView.getRGAEstudante(); // recebe na visão
        if (this.estudanteModel.buscarPorRGA(RGA) != null) { // verifica no modelo
            this.estudanteModel.excluir(RGA); // grava no modelo
            this.estudanteView.confirmarExclusaoEstudante(RGA); // mostra na visão
        }
    }

    public void atualizarEstudante() {
        this.estudanteView.atualizarEstudante(); // mostra na visão
        String RGA = this.estudanteView.getRGAEstudante(); // recebe na visão
        if (this.estudanteModel.buscarPorRGA(RGA) != null) { // verifica no modelo
            String nome = this.estudanteView.getNomeEstudante(); // recebe na visão
            this.estudanteModel.atualizar(this.estudanteModel.buscarPorRGA(RGA), nome); // grava no modelo
            this.estudanteView.confirmarAtualizacaoEstudante(RGA); // mostra na visão
        }
    }

    public void pesquisarEstudantePorRGA() {
        this.estudanteView.pesquisarEstudante(); // mostra na visão
        String RGA = this.estudanteView.getRGAEstudante(); // recebe na visão
        if (this.estudanteModel.buscarPorRGA(RGA) != null) { // verifica no modelo
            this.estudanteView.mostrarEstudante(this.estudanteModel.buscarPorRGA(RGA));  // busca no modelo e mostra na visão
        }
    }
}