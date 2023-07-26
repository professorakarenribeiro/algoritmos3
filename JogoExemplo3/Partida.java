public class Partida {

  private Jogador jogador01, jogador02;
  private Tabuleiro tabuleiro;

  public Tabuleiro getTabuleiro() {
    return tabuleiro;
  }

  public void setTabuleiro(Tabuleiro tabuleiro) {
    this.tabuleiro = tabuleiro;
  }

  public Jogador getJogador01() {
    return jogador01;
  }

  public void setJogador01(Jogador jogador01) {
    this.jogador01 = jogador01;
  }

  public Jogador getJogador02() {
    return jogador02;
  }

  public void setJogador02(Jogador jogador02) {
    this.jogador02 = jogador02;
  }

  public void criarTabuleiro(){
    this.setTabuleiro(new Tabuleiro());
    System.out.println("Tabuleiro criado!");
  }

  public void criarJogadores(){
    jogador01 = new Jogador();
    jogador01.setNome("Ada");
    jogador01.setSimbolo('X');
    jogador02 = new Jogador();
    jogador02.setNome("Alan");
    jogador02.setSimbolo('O');;
    System.out.println("Jogadores criados!");
  }

}