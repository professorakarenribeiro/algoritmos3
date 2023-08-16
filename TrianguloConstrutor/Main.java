/*
* Classe principal para aula sobre Método Construtor
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
class Main {
  public static void main(String[] args) {
    
    Triangulo t1 = new Triangulo(1.5, 2.0);
    System.out.println(t1.calcularArea());
    
    Triangulo t2 = new Triangulo();
    System.out.println(t2.calcularArea());
  }
}