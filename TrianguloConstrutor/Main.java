class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Triangulo t1 = new Triangulo(1.5, 2.0);
    System.out.println(t1.calcularArea());
    Triangulo t2 = new Triangulo();
    System.out.println(t2.calcularArea());
  }
}