import java.util.Date;

public class Usuario {
  protected String CPF;
  protected String nome;
  protected Date dataNascimento;

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

  public Date getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public void atualizarDados() {
    System.out.println("Exemplo de método que será herdado por filhas da classe Usuario.");
  }
}