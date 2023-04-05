class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Animal a1 = new Animal("A1");
    Animal a2 = new Cachorro("Bingo");
    Cachorro c3 = new Cachorro("Totó");

    a1.falar();
    //a1.latir();
    a2.falar();
    //a2.latir();
    c3.falar();
    c3.latir();
  }
}