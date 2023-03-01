public class Pessoa {
  private String nome;
  private int idade;
  private int passos;
  private String fala;
  
  public void falar(String fala){
    System.out.println(fala);
  }
  
  public void andar(int passos){
    // Integer.toString() faz o casting de int para String
    System.out.println("Andando " + Integer.toString(passos) + " passos por aí...");
  }
}