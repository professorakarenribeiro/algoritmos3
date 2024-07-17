/*
* Classe conceitual Robô Aspirados para aula introdutória sobre orientação a objetos
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
public class RoboAspirador{
  String marca, modelo;
  float bateria;

  public void carregar(){
    bateria = 100.0f;
    System.out.println("Bateria carregada!");
  }

  public void aspirar(String comodo){
    if (bateria >= 15.0f) {
      bateria = bateria - 15.0f;
      System.out.println("Cômodo "+comodo+" aspirado com sucesso!");
    } else {
      System.out.println("Carga insuficiente!");
    }
    
  }
}