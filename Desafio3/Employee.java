package Desafio3;

public class Employee {

    public String nome;
    public double GrossSalary;
    public double tax;

public Employee(){}   
public Employee (String name, double GrossSalary, double tax){
    this.nome = name;
    this.GrossSalary = GrossSalary;
    this.tax = tax;

}

public double netSalary(){
    return this.GrossSalary - (this.GrossSalary * (tax /100));
   
}

public void increseSalary(double porcentagem){

    this.GrossSalary = this.GrossSalary + (this.GrossSalary + (porcentagem / 100));
}

public String toString() {
    return "Employee: " +
           "nome :" + nome + '\'' +
           " grossSalary :" + GrossSalary +
           " tax :" + tax;
           
                
         
}
}
