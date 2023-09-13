/*
* Classe principal para aula introdutória sobre interfaces
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Pato p = new Pato();
    p.nadar(10);
    p.caminhar(15);
    p.pular();

    Tubarao t = new Tubarao();
    t.nadar(20);
    LocomocaoAquatica.motif();
    System.out.println(LocomocaoAquatica.texto);

  }
}