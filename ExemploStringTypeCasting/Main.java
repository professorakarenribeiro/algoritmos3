/*
* Classe principal para aula de Casting
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
* https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/String.html
*/
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // upcasting do tipo String para o tipo Object
    Object obj = new String("abc");

    // downcasting do tipo Object para o tipo String
    String str = (String)obj;
    System.out.println(str);

  }
}