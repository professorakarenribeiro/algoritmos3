public class Piramboia extends PeixeDipnoico {
  public void respirar(){
    System.out.println("Usando branquias para respirar");
    this.respiracaoComplementar();
  }
  public void respiracaoComplementar(){
    System.out.println("Usando pulmões para complementar a respiração");
  }
}