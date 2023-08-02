/*
* Classe principal para aula sobre Encapsulamento
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // Objetos Scanner para leitura de dados via teclado na console.
    Scanner entradaDouble = new Scanner(System.in);
    Scanner entradaString = new Scanner(System.in);

    // Instância da classe Triangulo
    Triangulo t = new Triangulo();

    // Atributos para manipulação
    String continua;

    // Recebe dados para calcular a área de um triângulo enquanto ENTER for informado na console
    do {
      System.out.println("--CALCULADORA DE ÁREA DE UM TRIÂNGULO--");
      
      System.out.println("Informe um valor de BASE para o triângulo:");
      t.setBase(entradaDouble.nextDouble()); // Lê o próximo double digitado na console
      System.out.println("Informe um valor de ALTURA para o triângulo:");
      t.setAltura(entradaDouble.nextDouble()); // Lê o próximo double digitado na console
      
      System.out.println("A área do triângulo informado é: " + Double.toString(t.calcularArea()));
      
      System.out.println("Deseja continuar? Digite ENTER para calcular a área de mais um triângulo.");
      continua = entradaString.nextLine(); // Lê a próxima string digitada na console
    
    } while (continua.isEmpty());
    // Fecha os scanners de teclado
    entradaString.close();
    entradaDouble.close();
  }
}