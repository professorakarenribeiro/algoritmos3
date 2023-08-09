/*
* Classe principal para aula introdutória à Linguagem Java
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
import java.util.Scanner; //Importa a classe Scanner
class Main {
  public static void main(String[] args) {
    
    //Cria um Scanner para obter entrada a partir da console
    Scanner entrada = new Scanner(System.in);
    
    //Cria uma nova instância/objeto da classe Triangulo
    Triangulo t1 = new Triangulo();
    
    //Imprime o texto na saída da console em uma única linha
    System.out.print("Informe um valor de base para o triângulo:");
    //Lê a informação e armazena no atributo da instância
    t1.base = entrada.nextFloat();
    
    //Imprime o texto na saída da console em uma única linha
    System.out.print("Informe um valor de altura para o triângulo:");
    //Lê a informação e armazena no atributo da instância
    t1.altura = entrada.nextFloat();
    
    //Faz o cálculo da área chamando o método da instância passando os valores como parâmetros e imprime resultado em texto concatenado na saída
    System.out.println("A área do triângulo é: " + Float.toString(t1.calcularArea(t1.base, t1.altura)));
  
  }
}