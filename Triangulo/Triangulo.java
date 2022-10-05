/*
* Classe conceitual Triangulo para aula introdutória à Linguagem Java
* Todos os métodos e atributos foram declarados como públicos propositalmente
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
public class Triangulo {
  
  //declaração de atributos da classe Triangulo
  public float base, altura, area;
  
  // método para cálculo da área do triangulo
  public float calcularArea(float base, float altura) {
    this.area = base * altura / 2; //recebe o valor de base e altura e atribui ao atributo area de Triangulo
    return this.area; //retorna o atributo área de Triangulo no método
  }
}