// Esta é a interface DAO da classe conceitual de Estudante e faz parte do Model
package model;

//imports Java
import java.util.ArrayList;

public interface EstudanteDAO {
    void inserir(Estudante estudante);

    void atualizar(Estudante estudante, String nome);

    void excluir(String RGA);

    Estudante buscarPorRGA(String RGA);

    ArrayList<Estudante> buscarTodos();
}