// Esta é a classe de Visão de Estudante via Interface de Console
package view;

import model.Estudante; // importe da classe conceitual do modelo

//imports Java
import java.util.ArrayList;
import java.util.Scanner;

public class EstudanteView {

    Scanner menu, entrada;

    public EstudanteView() {
        this.menu = new Scanner(System.in); // scanner para o menu de opções
        this.entrada = new Scanner(System.in); // scanner para as entradas de dados
    }

    public void encerrarView() { // método para encerramento da interface da console
        System.out.println("Encerrando o programa...");
        this.entrada.close();
        this.menu.close();
    }

    public int exibirMenu() { // método do menu da console
        System.out.println("------MENU SISTEMA DE ESTUDANTES:------");
        System.out.println("1 - Mostrar Estudantes;");
        System.out.println("2 - Inserir Estudante;");
        System.out.println("3 - Atualizar Estudante;");
        System.out.println("4 - Excluir Estudante;");
        System.out.println("5 - Pesquisar Estudante;");
        System.out.println("0 - Encerrar sistema.");
        System.out.print("-> Informe uma opção: ");
        int opcao = menu.nextInt();
        return opcao;
    }

    // métodos de impressão de dados na console
    public void mostrarEstudantes(ArrayList<Estudante> listaEstudantes) {
        System.out.println("------ESTUDANTES DO SISTEMA:------");

        for (int i = 0; i < listaEstudantes.size(); i++) {
            Estudante estudante = listaEstudantes.get(i);
            this.mostrarEstudante(estudante);
        }
    }

    public void mostrarEstudante(Estudante estudante) {
        System.out.println(estudante.getRGA() + ": " + estudante.getNome());
    }

    // métodos de entrada de dados na console
    public String getNomeEstudante() {
        System.out.println("Informe o nome completo do(a) estudante:");
        String nome = entrada.nextLine();
        return nome;
    }

    public String getRGAEstudante() {
        System.out.println("Informe o RGA do(a) estudante:");
        String RGA = entrada.nextLine();
        return RGA;
    }

    // mensagens de títulos CRUD
    public void inserirEstudante() {
        System.out.println("------INSERIR ESTUDANTE NO SISTEMA:------");
    }

    public void pesquisarEstudante() {
        System.out.println("------PESQUISAR ESTUDANTE NO SISTEMA:------");
    }

    public void excluirEstudante() {
        System.out.println("------EXCLUIR ESTUDANTE DO SISTEMA:------");
    }

    public void atualizarEstudante() {
        System.out.println("------ATUALIZAR ESTUDANTE NO SISTEMA:------");
    }

    // mensagens de confirmação CRUD
    public void confirmarExclusaoEstudante(String RGA) {
        System.out.println("Estudante " + RGA + " excluído com sucesso!");
    }

    public void confirmarInsercaoEstudante(String RGA) {
        System.out.println("Estudante " + RGA + " inserido com sucesso!");
    }

    public void confirmarAtualizacaoEstudante(String RGA) {
        System.out.println("Estudante " + RGA + " atualizado com sucesso!");
    }

    // mensagens de alerta
    public void opcaoInvalida() {
        System.out.println("Opção inválida! Tente novamente.");
    }
}