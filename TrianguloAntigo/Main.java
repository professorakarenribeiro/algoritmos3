import java.util.Scanner; //importa a classe Scanner

class Main {
  public static void main(String[] args) {
    //cria um Scanner para obter entrada a partir da janela da console
    Scanner entrada = new Scanner(System.in);
    
    //cria atributos do tipo float para o cálculo
    float base, altura, area;
    
    //imprime o texto na saída em uma única linha
    System.out.println("Informe o valor da base do triângulo:");
    //lê a informação e armazena
    base = entrada.nextFloat();
    
    System.out.println("Informe o valor da altura do triângulo:");
    //lê a informação e armazena
    altura = entrada.nextFloat();
    
    //cálculo da área
    area = base * altura / 2;
    
    //imprime resultado em texto concatenado na saída
    System.out.println("A área do triângulo é: " + Float.toString(area));
 }
}