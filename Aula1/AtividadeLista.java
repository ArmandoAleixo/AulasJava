 /*import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class AtividadeLista {
    public static void main(String[] args){
        var menu = 0;
        Scanner scanner = new Scanner(System.in);


            System.out.println("Bem-vindo ao Mercado!");
            System.out.println("Menu:");
            System.out.println("1. Adicionar item ao carrinho");
            System.out.println("2. Vizualizar itens no carrinho");
            System.out.println("3. Remover item do carrinho");
            System.out.println("4. Finalizar compra");
            System.out.println("Escolha uma opção:");
            menu = Integer.parseInt(scanner.next());
            ArrayList<String> carr = new ArrayList<String>();
            while (menu != 4) {

                if (menu == 1){
                    System.out.println("Adicione seu item");
                    carr.add (scanner.next());
                    System.out.println("Item adicionado!");


                }
                if ( menu == 2) {
                    System.out.println(" itens no seu carrinho: " +carr);

                }
                if( menu == 3) {


                    System.out.println("Escolha um item para remover: ");
                    System.out.println(carr);
                    var teste = scanner.next();
                    boolean contem = carr.contains(teste);
                    if (contem == true) {
                        carr.remove(teste);
                    }
                    else {
                        System.out.println("Seu carrinho não contem esse item");
                    }


                }
                System.out.println("Escolha uma opção");
                menu = Integer.parseInt(scanner.next());
                }

                 //System.out.print(carr);


    }

        

        
    } */

