public class Usuario {
  protected String CPF, nome, dataNascimento;

  Usuario() {
    System.out.println("Novo objeto usuário criado!");
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