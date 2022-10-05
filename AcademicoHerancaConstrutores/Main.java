import java.util.Date;
import java.util.Calendar;

class Main {
  public static void main(String[] args) {

    Date data = new Date();

    Usuario u01, u02;

    u01 = new Usuario("999.999.999-99", "Fulano de Tal", Calendar.getInstance().getTime());

    u02 = new Usuario();

    Docente u03 = new Docente("999.999.999-99", "Maria da Silva", Calendar.getInstance().getTime(), "9999999");

    Docente u04 = new Docente();

    Estudante u05 = new Estudante("999.999.999-99", "João ", Calendar.getInstance().getTime(), "9999999");

    Usuario u06 = new Estudante();

    Estudante e = (Estudante)u06;
    e.verHistorico();

    u04.verEncargos();

    u01.atualizarDados();
    u04.atualizarDados();
    u06.atualizarDados();

  }
}