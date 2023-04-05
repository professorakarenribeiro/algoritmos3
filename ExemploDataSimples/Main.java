import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Criando um objeto Date com a data atual
        Date data = new Date();

        // 2. Criando um objeto SimpleDateFormat com o formato desejado
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        // 3. Obtendo a data formatada como uma string
        String dataFormatada = formato.format(data);

        // Imprimindo a data formatada
        System.out.println(dataFormatada);
      
      /* Convertendo uma String para Data */

      String dataString = "25/12/2023";
        
        try {
            data = formato.parse(dataString);
            System.out.println(data);
        } catch (ParseException e) {
            System.out.println("Formato de data inválido");
        }
    }
}