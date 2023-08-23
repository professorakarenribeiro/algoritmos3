/*
* Classe conceitual Cachorro para aula sobre sobrecarga e sobrescrita de métodos
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
public class Cachorro extends Animal {

  // método construtor sobrescrito e sobrecarregado
  Cachorro(String nome) {
    super(nome);
    System.out.println("Cachorro criado com o nome: " + this.getNome());
  }

  Cachorro() {
    // construtor default
  }

  // método sobrescrito
  @Override
  public void emitirSom() {
    System.out.println("Au au");
  }

  // método sobrecarregado
  public String emitirSom(String tipoSom, int intensidade) {
    String som = "O cachorro está emitindo o som " + tipoSom + " com intensidade " + intensidade;
    System.out.println(som);
    return som;
  }
}