/*
* Classe para aula introdutória à Linguagem Java para exemplificar o uso de Java de forma imperativa
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
import java.util.Scanner; //Importa a classe Scanner

class Main {
  public static void main(String[] args) {
    //Cria um Scanner para obter entrada a partir da janela da console
    Scanner entrada = new Scanner(System.in);
    
    //Cria atributos do tipo float para o cálculo
    float base, altura, area;
    
    //Imprime o texto na saída em uma única linha
    System.out.print("Informe o valor da base do triângulo:");
    //Lê a informação e armazena
    base = entrada.nextFloat();
    
    //Imprime o texto na saída em uma única linha
    System.out.print("Informe o valor da altura do triângulo:");
    //Lê a informação e armazena
    altura = entrada.nextFloat();
    
    //Cálculo da área do triângulo
    area = base * altura / 2;
    
    //Imprime resultado em texto concatenado na saída
    System.out.println("A área do triângulo é: " + Float.toString(area));
 }
}