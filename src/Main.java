import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("lista de colores!");

        System.out.println("cuantos colores quieres introducir?");
        int numColores = input.nextInt();

        ArrayList<String> colores = new ArrayList<String>();

        for ( int i = 1; i <= numColores; i++) {

            System.out.println ("introduce el color nª" +i+":");
            String color = input.next();
            colores.add(color);

        }
        System.out.println("has introducido los siguiente colores:");
        for ( int i =0; i <colores.size(); i++){

            System.out.printf("\t"+colores.get(i));

        }
        input.close();


        }
    }
