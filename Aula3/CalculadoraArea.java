package Aula3;

public class CalculadoraArea {
    

    public static final double pi = 3.14;



    public static double calcularAreaTriangulo(double base, double altura){
      double triangulo = ((base *altura)/2);
      return triangulo;
        
    }
    public static double calcularAreaQuadrado (double lado){
     double quadrado = lado * lado;
     return quadrado;
    }
    public static double calcularAreaCirculo (double raio){
    double circulo = 3.14 * (raio * raio);
    return circulo;
    
    }


    
}
