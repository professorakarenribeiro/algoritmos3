/*
* Classe principal para aula de Polimorfismo
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
* 
*/
class Main {
  public static void main(String[] args) {

    Usuario eg01 = new EstudanteGraduacao("Joao"); // upcasting
    Estudante eg02 = new EstudanteGraduacao("Pedro"); // upcasting
    EstudanteGraduacao eg03 = new EstudanteGraduacao("Maria");

    eg01 = eg03; // upcasting
    System.out.println(eg01.getClass().getName());

    eg03 = (EstudanteGraduacao) eg02; // downcasting
    System.out.println(eg03.getClass().getName());

    EstudantePosGraduacao epg04 = new EstudantePosGraduacao("Carla");

    // Vetor simples de Estudantes
    Estudante estudantes[] = {eg02, eg03, epg04};

    // Solução para execução polimórfica do método verHistorico()
    for (int i = 0; i < estudantes.length; i++) {
      estudantes[i].verHistorico();
    }
}
}