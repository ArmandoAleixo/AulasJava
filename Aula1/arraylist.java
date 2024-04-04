
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args){

        ArrayList<Integer> numeros = new ArrayList<>(); //numeros
        ArrayList<String> nomes = new ArrayList<>(); 

        numeros.add(11);
        numeros.add(12);
        numeros.add(13);
        numeros.add(14);

        nomes.add("BMW");
        nomes.add("Ferrari");
        nomes.add("Supra");
        nomes.add("Mercedes");

        for(int x: numeros){
            System.out.println(x);
    
        }

        for(String y: nomes){
            System.out.println(y);
        }
    }
}
