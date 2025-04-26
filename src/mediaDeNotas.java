import java.util.Scanner;

public class mediaDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, n4, media;


        System.out.println("digite suas 4 notas:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();

        if (n1 <=10 && n2 <=10 && n3 <=10 && n4 <= 10){

        media = (n1 + n2 + n3 + n4) / 4;


        if(media >= 7)
        {

          System.out.println("sua nota eh " + media + " aprovado");

        }

        else
            System.out.println("sua nota eh " + media + " reprovado");

        }

        else
            System.out.println("numeros digitados sao invalidos");
    }



}
