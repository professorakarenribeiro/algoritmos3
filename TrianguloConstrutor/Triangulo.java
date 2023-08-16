/*
* Classe conceitual Triangulo para aula sobre Método Construtor 
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
public class Triangulo {

  private double base, altura, area;

  Triangulo() {
    // construtor default
  }

  // Método construtor por base e altura
  Triangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  // Método para cálculo da área do triangulo via base e altura
  public double calcularArea() {
    if (base > 0 && altura > 0) {
      area = base * altura / 2;
      return area;
    } else {
      System.out.println("Os valores de base e altura devem ser maiores do que 0 para o cálculo da área do triângulo.");
      return 0;
    }
  }
}