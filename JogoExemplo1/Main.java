class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // Cria jogadores
    Jogador j01 = new Jogador();
    j01.setNome("Ada");
    j01.setSimbolo('X');
    Jogador j02 = new Jogador();
    j01.setNome("Alan");
    j01.setSimbolo('O');

    // Cria uma nova partida
    Partida p = new Partida();

    // Cria um novo tabuleiro
    Tabuleiro t = new Tabuleiro();

    // Limpa e mostra o tabuleiro
    t.limparTabuleiro();
    t.exibirTabuleiro();

    // Exemplo de Jogada
    t.marcarPosicao(1, 1, j01);
    t.exibirTabuleiro();

  }
}