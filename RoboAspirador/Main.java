/*
* Classe principal para aula sobre aula introdutória sobre orientação a objetos
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
public class Main {
  public static void main(String[] args) {
    
    RoboAspirador r2d2 = new RoboAspirador();
    r2d2.carregar();
    r2d2.marca = "Consul";
    r2d2.modelo = "Star Wars Bot";
    r2d2.aspirar("Quarto");
    r2d2.aspirar("Quarto2");
    r2d2.aspirar("Quarto3");
    r2d2.aspirar("Quarto4");
    r2d2.aspirar("Quarto5");
    r2d2.aspirar("Cozinha");
    r2d2.aspirar("Sala");
  }
}