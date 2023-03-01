public class Triangulo {
  
  //declaração de atributos da classe Triangulo
  public float base, altura, area;
  
  // método para cálculo da área do triangulo
  public float calcularArea(float base, float altura) {
    this.area = base * altura / 2; //recebe o valor de base e altura e atribui ao atributo area de Triangulo
    return this.area; //retorna o atributo área de Triangulo no método
  }
}