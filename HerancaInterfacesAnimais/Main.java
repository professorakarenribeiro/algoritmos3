/*
* Classe principal para aula introdutória sobre interfaces
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Peixe p1 = new PeixePalhaco();
    Peixe p2 = new Piramboia();

    p1.respirar();
    p2.respirar();
  }
}