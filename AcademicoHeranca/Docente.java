public class Docente extends Usuario {

  protected String SIAPE;

  Docente() {
    System.out.println("Novo objeto docente criado!");
  }

  public String getSIAPE() {
    return SIAPE;
  }

  public void setSIAPE(String SIAPE) {
    this.SIAPE = SIAPE;
  }

  public void verEncargos() {
    System.out.println("Exemplo de método da classe Docente.");
  }
}