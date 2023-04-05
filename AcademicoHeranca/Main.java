class Main {
  public static void main(String[] args) {

    Usuario u01, u02;
    u01 = new Usuario(); // Instanciamento direto

    u02 = new Estudante(); // Instanciamento indireto
    //System.out.println(u02.getClass());

    Docente u03 = new Docente(); // Instanciamento direto

    // u01.atualizarDados();

    // // métodos herdados
    // u02.atualizarDados();
    // u03.atualizarDados();

    // // métodos específicos
    // Estudante e = (Estudante)u02;
    // e.verHistorico();
    // u03.verEncargos();

  }
}