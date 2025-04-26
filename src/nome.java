import java.util.Scanner;

public class nome {
    public static void main(String[] args) {
        long  n1, n2, soma, multiplicacao, subtracao;
        float divisao;

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero:");
        n1 = sc.nextInt();

        System.out.println("digite o segundo numero:");
        n2 = sc.nextInt();

       soma = n1 + n2;

       System.out.println("a soma e\n" + soma);

       multiplicacao = n1 * n2;

       System.out.println("a multiplicacao eh\n" + multiplicacao);

       subtracao = n1 - n2;

       System.out.println("a subtracao eh\n" + subtracao);

       divisao = n1 / n2;

        System.out.println("a divisao eh\n" + divisao);


    }
}