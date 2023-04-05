public class Cachorro extends Animal {
  public Cachorro(String nome) {
    super(nome);
    System.out.println("Método construtor do cachorro");
  }

  public void latir() {
    System.out.println("Au, au!");
  }

  public void falar() {
    System.out.print(nome + ": ");
    this.latir();
  }
}