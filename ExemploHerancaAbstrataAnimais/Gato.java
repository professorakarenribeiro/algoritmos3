/*
* Classe conceitual Gato para aula sobre classes abstratas
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
public class Gato extends Animal {
  public Gato(String nome) {
    super(nome); // chama o construtor da superclasse
  }

  // definição de comportamento para o método abstrato da superclasse
  @Override
  public String emitirSom() {
    return "Miau!";
  }
}