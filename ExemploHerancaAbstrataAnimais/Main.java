import java.util.ArrayList;
/*
* Classe principal para aula sobre classes abstratas
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
class Main {
  public static void main(String[] args) {
    
    Animal cachorro = new Cachorro("Bidu");
    Animal gato = new Gato("Mingau");

    System.out.println(cachorro.getNome() + " faz " + cachorro.emitirSom());
    System.out.println(gato.getNome() + " faz " + gato.emitirSom());

    // Solução usando listas
    ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
    listaAnimais.add(cachorro);
    listaAnimais.add(gato);

    for (int i = 0; i < listaAnimais.size(); i++) {
      Animal animal = listaAnimais.get(i);
      System.out.println(animal.getNome() + " faz " + animal.emitirSom());
    }

  }
}