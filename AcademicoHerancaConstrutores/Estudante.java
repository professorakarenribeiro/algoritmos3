public class Estudante extends Usuario {
  protected String RGA;

  Estudante() {
    System.out.println("Novo objeto estudante criado!");
  }

  Estudante(String CPF, String nome, String dataNascimento, String RGA) {
    super(CPF, nome, dataNascimento);
    this.setRGA(RGA);
    System.out.println("Objeto do tipo estudante com RGA");
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