public class Triangulo {

  private double base, altura, l1, l2, l3, area;

  Triangulo(){
    //construtor default
  }
  Triangulo(double base, double altura){
    this.base = base;
    this.altura = altura;
  }

  Triangulo(double l1, double l2, double l3){
    this.l1 = l1;
    this.l2 = l2;
    this.l3 = l3;
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

  public double getL1() {
    return l1;
  }

  public void setL1(double l1) {
    this.l1 = l1;
  }

  public double getL2() {
    return l2;
  }

  public void setL2(double l2) {
    this.l2 = l2;
  }

  public double getL3() {
    return l3;
  }

  public void setL3(double l3) {
    this.l3 = l3;
  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public double calcularArea() {
    double area = (this.getBase() + this.getAltura())/ 2;
    this.setArea(area);
    return area;
  }
}