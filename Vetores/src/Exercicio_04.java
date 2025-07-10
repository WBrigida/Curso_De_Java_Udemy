import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros inteiros voce vai digitar? ");
        int n = sc.nextInt();

        int[] numero = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Dgite um numero: ");
            numero[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES:");

        int pares = 0;
        for (int i=0; i<n; i++){
            if (numero[i] % 2 == 0){
                System.out.printf("%d  ", numero[i]);
                pares++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", pares);

        sc.close();
    }
}
