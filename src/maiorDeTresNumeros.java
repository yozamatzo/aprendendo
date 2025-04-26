import java.util.Scanner;

public class maiorDeTresNumeros {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int a, b, c, maior;


      System.out.println("digite os tres numeros");

      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();

      maior = a;

      if (a > b && a > c){

          System.out.println(maior);
      }
      else if (b > a && b > c){
          maior = b;
          System.out.println(maior);

      }
      else if (c > a && c > b) {
          maior = c;
          System.out.println(maior);

      }
    }
}
