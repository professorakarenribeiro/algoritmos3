public class Animal {
  
  protected String nome;
  
  public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Animal(String nome) {
    this.setNome(nome);
    System.out.println("Método construtor de Animal");
  }

  public void comer() {
    System.out.println(this.nome + " está comendo...");
  }

  public void falar() {
    System.out.println(this.nome + " está falando...");
  }
}