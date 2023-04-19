class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Animal a01 = new Animal();
    
    Cachorro c02 = new Cachorro();

    a01.emitirSom();

    c02.emitirSom();
    c02.emitirSom("Grrrr", 5);
    
  }
}