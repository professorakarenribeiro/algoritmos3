public class Docente extends Usuario {

  protected String SIAPE;

  Docente() {
    System.out.println("Novo objeto docente criado!");
  }

  Docente(String CPF, String nome, String dataNascimento, String SIAPE) {
    super(CPF, nome, dataNascimento);
    this.setSIAPE(SIAPE);
    System.out.println("Objeto do tipo docente com SIAPE");
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

  @Override
  public void atualizarDados() {
    System.out.println("Método sobrescrito");
  }
}