public class Saudacao {
    public static void main(String[] args) {

        // Verifica se foi passado um argumento de linha de comando - esta verificação é opcional
        if (args.length != 1) {
            System.err.println("Como usar: java Saudacao <nome>");
            System.exit(1); // interrompe a execução do programa
        }

        // Lê o argumento de linha de comando na primeira posição, ou seja, posição 0
        String nome = args[0];

        // Imprime a saudação personalizada
        System.out.println("Olá, " + nome + "! Bem-vinde!");
    }
}