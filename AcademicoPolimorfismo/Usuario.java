/*
* Classe conceitual para aula de Polimorfismo
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
* 
*/
public abstract class Usuario {

  protected String CPF;
  protected String nome;
  protected String dataNascimento;
  
  Usuario(String nome) {
    System.out.println("Novo objeto " + nome + " criado!");
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String CPF) {
    this.CPF = CPF;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public void atualizarDados() {
    System.out.println("Exemplo de método que será herdado por filhas da classe Usuario.");
  }

}