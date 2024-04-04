package Desafio3;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
    Scanner sc =  new Scanner (System.in);
    Employee employee = new Employee();

    System.out.println("Digite o nome do funcionario :");
    String nome = sc.nextLine();

    System.out.println("Digite o salario :");
    double salario = sc.nextDouble();

    System.out.println("informe a taxa :");
    double taxa = sc.nextDouble();

    double salarioL = (taxa / 100) * salario;
    sc.nextLine();

    System.out.println("Digite o nome do outro funcionario :");
    String nome2 = sc.nextLine();

    System.out.println("Digite o salario :");
    double salario2 = sc.nextDouble();

    System.out.println("informe a taxa :");
    double taxa2 = sc.nextDouble();

    double salarioL2 = (taxa2 / 100) * salario2;

    System.out.println("Dados do funcionario: " + nome +"/ Salario :" + salario + "/ Salario Liquido :" + salarioL);

    System.out.println("Dados do funcionario: " + nome2 +"/ Salario :" + salario2 + "/ Salario Liquido :" + salarioL2);
    
    }
}
       
      
        
           
    
    


    