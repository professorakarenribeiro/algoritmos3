/*
* Classe principal para aula sobre sobrecarga e sobrescrita de métodos
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Animal a01 = new Animal();
    
    Cachorro c02 = new Cachorro();

    Cachorro c03 = new Cachorro("Bidú");

    a01.emitirSom();

    c02.emitirSom();
    c02.emitirSom("Grrrr", 5);

    c03.emitirSom("Auuuuuu", 4);
    
  }
}