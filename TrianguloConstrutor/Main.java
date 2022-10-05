/*
* Classe principal para aula de Construtor
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    //exemplos de como usar os métodos construtores
    Triangulo t1 = new Triangulo();
    Triangulo t2 = new Triangulo(3.75, 5.0);
    
    System.out.println(t1.calcularArea());
    System.out.println(t2.calcularArea());
    
    // SOLUÇÃO ALTERNATIVA USANDO VETOR 
    Triangulo[] triangulos = new Triangulo[3];
    
    for (int i = 0; i < triangulos.length; i++) {
      double base, altura;
      System.out.println("Informe um valor de BASE para o triângulo " + i + ":");
      base = entrada.nextDouble();
      System.out.println("Informe um valor de ALTURA para o triângulo " + i + ":");
      altura = entrada.nextDouble();
      Triangulo t = new Triangulo(base, altura);
      triangulos[i] = t;
      System.out.println("A área do triângulo " + i + " é " + triangulos[i].calcularArea());
    }

  }
}