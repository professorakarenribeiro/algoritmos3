/*
* Classe conceitual Animal para aula sobre sobrecarga e sobrescrita de métodos
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
public class Animal {

  String nome;

  // método construtor sobrecarregado
  Animal(String nome) {
    this.nome = nome;
  }

  Animal() {
    // construtor default
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void emitirSom() {
    System.out.println("Som genérico de animal");
  }
}