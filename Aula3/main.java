package Aula3;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
    Scanner sc =  new Scanner (System.in);
    CalculadoraArea calculadoraArea = new CalculadoraArea();

        System.out.println("Calculadora de area do aleixo");
        
        
        System.out.print("Digite o lado do quadrado :");
       
        
        double area = sc.nextDouble();
        double quadrado = calculadoraArea.calcularAreaQuadrado(area);
        System.out.println(" area do quadrado é :" + quadrado);
        
        
        System.out.println("Digite o raio do circulo :");
        

        double raio = sc.nextDouble();
        double circulo = calculadoraArea.calcularAreaCirculo(raio);
        System.out.println("Area do circulo :" + circulo);


        System.out.println("Digite a base :");
        System.out.println("digite a altura :");
        

        double base = sc.nextDouble();
        double altura = sc.nextDouble();
        double triangulo = CalculadoraArea.calcularAreaTriangulo(base,altura);

        System.out.println("Area do tringulo é :" + triangulo);



        
        
        
    
}
}