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
    p.setJogador01(j01);
    p.setJogador02(j02);

    // Cria um novo tabuleiro
    p.criarTabuleiro();

    // Limpa e mostra o tabuleiro
    p.getTabuleiro().limparTabuleiro();
    p.getTabuleiro().exibirTabuleiro();

    // Exemplo de Jogada
    p.getTabuleiro().marcarPosicao(1, 1, j01);
    p.getTabuleiro().exibirTabuleiro();

  }
}