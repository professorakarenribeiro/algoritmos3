public interface LocomocaoTerrestre {
  void caminhar(int metros);

  default void pular() {
    System.out.println(this.getClass().getName() + " pulando!");
  }
}