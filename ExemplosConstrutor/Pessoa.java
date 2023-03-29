public class Pessoa {
  private String nome, genero;
  private int idade;

  public Pessoa(String nome, int idade, String genero) {
    this.nome = nome;
    this.idade = idade;
    this.genero = genero;
  }

  // getters e setters para os atributos
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

}