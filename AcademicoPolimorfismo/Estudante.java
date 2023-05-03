/*
* Classe conceitual para aula de Polimorfismo
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
* 
*/
public abstract class Estudante extends Usuario {

  protected String RGA;

  Estudante(String nome) {
    super("Estudante " + nome);
  }

  public String getRGA() {
    return RGA;
  }

  public void setRGA(String RGA) {
    this.RGA = RGA;
  }

  public void verHistorico() {
    System.out.println("Exibindo histórico por semestre...");
  }

}