/*
* Classe conceitual para aula de Polimorfismo
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
* 
*/
public class Docente extends Usuario {

  protected String SIAPE;
  
  Docente(String nome) {
    super("Docente "+nome);
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