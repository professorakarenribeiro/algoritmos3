public class Tabuleiro {

  private final int TAMANHO = 3;
  private char[][] tabuleiro = new char[TAMANHO][TAMANHO];

  public void limparTabuleiro() {
    for (int i = 0; i < TAMANHO; i++) {
      for (int j = 0; j < TAMANHO; j++) {
        tabuleiro[i][j] = ' ';
      }
    }
  }

  public void exibirTabuleiro() {
    for (int i = 0; i < TAMANHO; i++) {
      for (int j = 0; j < TAMANHO; j++) {
        System.out.print(tabuleiro[i][j]);
        if (j < TAMANHO - 1) {
          System.out.print(" | ");
        }
      }
      System.out.println();
      if (i < TAMANHO - 1) {
        System.out.println("---------");
      }
    }
  }

  public boolean marcarPosicao(int x, int y, Jogador jogador) {
    if (x < 0 || x >= TAMANHO || y < 0 || y >= TAMANHO || tabuleiro[x][y] != ' ') {
      System.out.println("Posição inválida. Tente novamente.");
      return false;
    }

    tabuleiro[x][y] = jogador.getSimbolo();
    return true;
  }

}