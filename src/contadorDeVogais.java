import java.util.Locale;
import java.util.Scanner;

public class contadorDeVogais {
    public static void main(String[] args) {

        String palavra;
        int contador = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite uma palavra");

        palavra = sc.nextLine().toLowerCase();

        for (int i = 0; i < palavra.length(); i++) {

           char letra = palavra.charAt(i);
           if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra== 'u'){

               contador++;

           }



        }


        System.out.println(contador);

    }
}
