import java.util.Scanner;

public class tabuada {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);

      int n1, i, multiplicador;

      System.out.println("digite o numero:");
      n1 = sc.nextInt();

      for(i = 0; i <= 10; i++) {


       multiplicador = n1 * i;

       System.out.println(n1+ "x" + (i) + "=" + multiplicador);
      }
    }
}
