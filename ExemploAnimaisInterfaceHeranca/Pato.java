public class Pato extends Ave implements LocomocaoAerea, LocomocaoTerrestre, LocomocaoAquatica {
  public void voar(int metros) {
    System.out.println("Voando..." + metros);
  }

  public void nadar(int metros) {
    System.out.println("Nadando..." + metros);
  }

  public void caminhar(int metros) {
    System.out.println("Caminhando..." + metros);
  }
}