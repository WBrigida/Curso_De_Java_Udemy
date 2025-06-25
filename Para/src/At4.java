import java.util.Scanner;

public class At4 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int n = sc.nextInt();

        System.out.println("Digite pares de numeros para serem divididos: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
        sc.close();
    }
}
