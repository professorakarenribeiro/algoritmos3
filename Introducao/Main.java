/*
* Classe executável princial para aula introdutória à Linguagem Java
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/

import java.util.Scanner; //importa a classe Scanner utilizada para ler entradas na console

class Main {
  //método principal
  public static void main(String[] args) {
    //método para escrever na saída da console, escreve "Hello, World!"
    System.out.println("Hello, world!");
    
    //exemplos de declaração de atributos de tipos primitivos
    int idade;
    float preco = 0.10f;
    boolean estaChovendo = false;

    //exemplos de declaração de atributos de tipos não primitivos
    String nome;
    Scanner entrada = new Scanner(System.in);

    //exemplos de declaração de atributos de tipos não primitivos de classes criadas no projeto
    Triangulo t1 = new Triangulo();
    Pessoa joao = new Pessoa();
    //Pessoa maria = new Pessoa("Maria");
    
    //usando atributos e métodos de um objeto da classe Triangulo 
    System.out.println("Escreva um valor de base para um triangulo:");
    t1.base = entrada.nextFloat();
    t1.calcularArea(t1.base, 3.0f);
    System.out.println(t1.calcularArea(t1.base, 3.0f));

    //usando atributos e métodos de objetos da classe Pessoa 
    joao.nome = "João";
    System.out.println(joao.nome);
    //System.out.println(maria.nome);
  }
}