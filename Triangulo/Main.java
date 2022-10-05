/*
* Classe principal para aula introdutória à Linguagem Java
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
import java.util.Scanner; //importa a classe Scanner
class Main {
  public static void main(String[] args) {
    
    //cria um Scanner para obter entrada a partir da console
    Scanner entrada = new Scanner(System.in);
    
    //cria uma nova instância/objeto da classe Triangulo
    Triangulo t1 = new Triangulo();
    
    //imprime o texto na saída em uma única linha
    System.out.println("Informe um valor de base para o triângulo:");
    
    //lê a informação e armazena no atributo da instância
    t1.base = entrada.nextFloat();
    
    System.out.println("Informe um valor de altura para o triângulo:");
    
    //lê a informação e armazena no atributo da instância
    t1.altura = entrada.nextFloat();
    
    //Faz o cálculo da área chamando o método da instância passando os valores como parâmetros e imprime resultado em texto concatenado na saída
    System.out.println("A área do triângulo é: " + Float.toString(t1.calcularArea(t1.base, t1.altura)));
  
  }
}