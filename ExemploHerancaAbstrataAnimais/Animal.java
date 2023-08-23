/*
* Classe conceitual abstrata Animal para aula sobre classes abstratas
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
public abstract class Animal {
  private String nome;

  public Animal(String nome) {
    this.setNome(nome);
    System.out.println("Um novo objeto do tipo "+this.getClass().getName()+" foi criado!");
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  // método abstrato
  public abstract String emitirSom();
}