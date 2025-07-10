import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int x = sc.nextInt();

        double[] vet = new double[x];
        for (int i=0; i<x; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i=0; i<x; i++){
            soma = soma + vet[i];
        }

        double media = soma / x;

           System.out.print("Valores = ");

        for (int i=0; i<x; i++){
            System.out.printf("%.1f ", vet[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}
