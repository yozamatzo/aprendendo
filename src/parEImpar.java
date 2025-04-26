import java.util.Scanner;

public class parEImpar {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.println("digite o numero:");
        n1 = sc.nextInt();

        if(n1%2==0)
        {

          System.out.println("seu numero eh par");

        }
        else
        {

            System.out.println("seu numero eh impar");

        }
    }
}
