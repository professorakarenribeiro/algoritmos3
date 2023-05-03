/*
* Classe conceitual para aula de Polimorfismo
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
* 
*/
public class EstudantePosGraduacao extends Estudante {
  EstudantePosGraduacao(String nome) {
    super("de Pós Graduação "+nome);
  }
  @Override
  public void verHistorico(){
    System.out.println("Exibindo histórico por ano para estudante de pós-graduação...");
  }
}