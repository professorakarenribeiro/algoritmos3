class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // Cria uma nova partida
    Partida p = new Partida();
    
    // Cria jogadores
    p.criarJogadores();

    // Cria um novo tabuleiro
    p.criarTabuleiro();

    // Limpa e mostra o tabuleiro
    p.getTabuleiro().limparTabuleiro();
    p.getTabuleiro().exibirTabuleiro();

    // Exemplo de Jogada
    p.getTabuleiro().marcarPosicao(1, 1, p.getJogador01());
    p.getTabuleiro().exibirTabuleiro();

  }
}