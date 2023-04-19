class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Animal cachorro = new Cachorro("Bidu");
    Animal gato = new Gato("Mingau");

    System.out.println(cachorro.getNome() + " faz " + cachorro.emitirSom());
    System.out.println(gato.getNome() + " faz " + gato.emitirSom());
  }
}