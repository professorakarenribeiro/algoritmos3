package com.example.model;
// Esta é a interface DAO da classe conceitual de Estudante

import java.util.ArrayList;

public interface EstudanteDAO {
    void inserir(Estudante estudante);

    void atualizar(Estudante estudante, String nome);

    void excluir(String RGA);

    Estudante buscarPorRGA(String RGA);

    ArrayList<Estudante> buscarTodos();
}