import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Peixe p1 = new PeixePalhaco(); // peixe branquial
    Peixe p2 = new Piramboia(); // peixe complementar

    Cachorro c1 = new Cachorro(); // mamífero pulmonar

    /*
     * executando série de respiração individualmente considerando seus tipos de origem
     */
    p1.respirar();
    p2.respirar();
    c1.respirar();

    /*
     * executando série de respiração coletivamente via método polimórfico
     * respirar()
     */
    ArrayList<Animal> listaAnimais = new ArrayList<Animal>();
    listaAnimais.add(p1);
    listaAnimais.add(p2);
    listaAnimais.add(c1);

    for (int i = 0; i < listaAnimais.size(); i++) {
      Animal animal = listaAnimais.get(i);
      System.out.println(animal.getClass().getName());
      animal.respirar();
    }

  }
}