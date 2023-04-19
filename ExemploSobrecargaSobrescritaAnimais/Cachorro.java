public class Cachorro extends Animal {
  @Override
  public void emitirSom() {
    System.out.println("Au au");
  }

  public String emitirSom(String tipoSom, int intensidade) {
    String som = "O cachorro está emitindo o som " + tipoSom + " com intensidade " + intensidade;
    System.out.println(som);
    return som;
  }
}