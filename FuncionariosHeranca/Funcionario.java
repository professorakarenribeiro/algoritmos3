/*
* Classe conceitual para aula de Herança
* Conteúdo elaborado para fins educativos por Prof.ª Dr.ª Karen Ribeiro (karen@ic.ufmt.br)
*/
public class Funcionario {
   protected double salario;
  
   Funcionario (double salario) {
   this.salario = salario;
}

   public double getSalario() {
       return salario;
   }
  
   public double getBonus() {
       return salario * 0.1;
   }

   public void setSalario(double salario) {
       this.salario = salario;
   }
  
}