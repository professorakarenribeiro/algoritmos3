/*
* Classe conceitual Triangulo para aula de Construtor 
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
public class Triangulo {
  
  private double area, base, altura;
  
  Triangulo(){
    //método construtor que simula o método construtor default
  }
  Triangulo(double base, double altura){
    //novo método construtor para a inicialização de parâmetros importantes da classe
    this.setBase(base);
    this.setAltura(altura);
  }
  
  //métodos get e set PÚBLICOS
  public double getAltura() {
    return altura;
  }
  
  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  // método para cálculo da área do triangulo via base e altura
  public double calcularArea() {
    if (base > 0 && altura > 0) {
      area = base * altura / 2;
      return area;
    } else {
      System.out.println("Os valores de base e altura devem ser maiores do que 0 para o cálculo da área.");
      return 0;
    }
  }

}
