import java.util.Scanner;

public class At5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo da peça 1: ");
        int codigo1 = sc.nextInt();

        System.out.println("Digte o número de peças : ");
        int numero1 = sc.nextInt();

        System.out.println("Digite  o valor unitário de cada peça 1");
        double valor1 = sc.nextDouble();

        System.out.println("Digite o codigo da peça 2: ");
        int codigo2 = sc.nextInt();

        System.out.println("Digte o número de peças : ");
        int numero2 = sc.nextInt();

        System.out.println("Digite  o valor unitário de cada peça 2");
        double valor2 = sc.nextDouble();

        double valorTotal = (numero1 * valor1 + numero2 * valor2);
        System.out.printf("VALOR A PAGAR: %.2f%n " , valorTotal);

        sc.close();
    }
}
