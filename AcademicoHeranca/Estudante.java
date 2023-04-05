public class Estudante extends Usuario {
  protected String RGA;

  Estudante() {
    System.out.println("Novo objeto estudante criado!");
  }

  public String getRGA() {
    return RGA;
  }

  public void setRGA(String RGA) {
    this.RGA = RGA;
  }

  public void verHistorico() {
    System.out.println("Exemplo de método da classe Estudante.");
  }
}