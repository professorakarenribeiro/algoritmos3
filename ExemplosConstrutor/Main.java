/*
* Classe principal para aula sobre métodos construtores
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
class Main {
  public static void main(String[] args) {

    Pessoa p1 = new Pessoa("Fei-Fei Li", 47, "feminino");
    System.out.println(p1.getNome());
    System.out.println(p1.getIdade());
    System.out.println(p1.getGenero());

    // Pessoa p2 = new Pessoa();

    Bola b1 = new Bola("Futebol");
    System.out.println(b1.getEsporte());
    Bola b2 = new Bola(12.41);
    System.out.println(b2.getRaio());
  }
}