public abstract class Animal {
  private String nome;

  public Animal(String nome) {
    this.setNome(nome);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public abstract String emitirSom();
}