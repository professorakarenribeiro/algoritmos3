// Esta é a classe que permite manipular o arquivo CSV para apersistência de dados sem afetar o restante do código do projeto.
package Model;

public class CSVHandler {
  private String arquivoCSV = "estudantes.csv"; // Nome do arquivo CSV
  
  private void carregarDadosCSV() { // Método para carregar os dados do arquivo CSV
    try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
        String linha; // Variável para armazenar cada linha do arquivo CSV
        while ((linha = br.readLine()) != null) { // Lê cada linha do arquivo CSV
            String[] dados = linha.split(","); // Separa os dados da linha em um array de strings
            if (dados.length == 2) { // Verifica se a linha tem exatamente dois campos separados por vírgula
                listaDadosEstudantes.add(new Estudante(dados[0], dados[1])); // Adiciona um novo objeto Estudante à lista usando os dados da linha
            }
        }
        br.close(); // Fecha o arquivo CSV
    } catch (IOException e) { // Trata exceções de entrada/saída se houver
        e.printStackTrace();
    }
  }

  private void salvarDadosCSV() { // Método para salvar os dados do arquivo CSV
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCSV))) {
        for (Estudante estudante : listaDadosEstudantes) { // Percorre a lista de objetos Estudante
            bw.write(estudante.getRGA() + "," + estudante.getNome()); // Escreve os dados do objeto Estudante no arquivo CSV
            bw.newLine(); // Adiciona uma nova linha no arquivo CSV
        }
       bw.close(); // Fecha o arquivo CSV
    } catch (IOException e) { // Trata exceções de entrada/saída se houver
        e.printStackTrace();
    }
  }
}