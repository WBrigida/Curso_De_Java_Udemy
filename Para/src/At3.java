import java.util.Scanner;

public class At3 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para representar os casos de teste que vem a seguir: ");
        int n = sc.nextInt();

        System.out.println("Digite os valores do teste em valores reais: ");
        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}
