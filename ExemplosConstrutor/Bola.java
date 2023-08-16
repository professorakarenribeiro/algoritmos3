/*
* Classe conceitual Bola para aula sobre métodos construtores
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
public class Bola {
  private String cor, material, esporte;
  private double raio;

  Bola(String esporte) {
    this.esporte = esporte;
  }

  Bola(double raio) {
    this.raio = raio;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getEsporte() {
    return esporte;
  }

  public void setEsporte(String esporte) {
    this.esporte = esporte;
  }

  public double getRaio() {
    return raio;
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

}