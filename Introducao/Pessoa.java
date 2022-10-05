/*
* Classe conceitual Pessoa para aula introdutória à Linguagem Java
* Todos os métodos e atributos foram declarados como públicos propositalmente
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
public class Pessoa {
  public String nome;
  public int idade;
  public int passos;
  public String fala;
  
  // //método construtor da classe Pessoa
  // Pessoa(String nome){
  //   this.nome = nome;
  // }
  
  public void falar(String fala){
    System.out.println(fala);
  }
  
  public void andar(int passos){
    // Integer.toString() faz o casting de int para String
    System.out.println("Andando " + Integer.toString(passos) + " passos por aí...");
  }
}