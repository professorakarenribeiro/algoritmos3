/*
* Classe principal para aula de Encapsulamento
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
   //  //cria instâncias/objetos da classe Triangulo
   //  Triangulo t1 = new Triangulo();

    
   // Triangulo t2 = new Triangulo();
    
   //  System.out.println("Informe um valor de BASE para o triângulo 1:");
   //  t1.setBase(entrada.nextDouble());
   //  System.out.println("Informe um valor de ALTURA para o triângulo 1:");
   //  t1.setAltura(entrada.nextDouble());
    
   //  System.out.println("Informe um valor de BASE para o triângulo 2:");
   //  t2.setBase(entrada.nextDouble());
   //  System.out.println("Informe um valor de ALTURA para o triângulo 2:");
   //  t2.setAltura(entrada.nextDouble());
    
   //  System.out.println("A área do triângulo 1 é: " + Double.toString(t1.calcularArea()));
   //  System.out.println("A área do triângulo 2 é: " + Double.toString(t2.calcularArea()));

    // // SOLUÇÃO ALTERNATIVA USANDO VETOR 
    Triangulo[] triangulos = new Triangulo[3];
    
    for (int i = 0; i < triangulos.length; i++) {
      Triangulo t = new Triangulo();
      System.out.println("Informe um valor de BASE para o triângulo " + i + ":");
      t.setBase(entrada.nextDouble());
      System.out.println("Informe um valor de ALTURA para o triângulo " + i + ":");
      t.setAltura(entrada.nextDouble());
      triangulos[i] = t;
    }

    for (int i = 0; i < triangulos.length; i++) {
      System.out.println("A área do triângulo " + i + " é " + triangulos[i].calcularArea());
    }
    
  
  }
}