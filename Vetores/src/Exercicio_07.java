import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vet = new double[n];
        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i=0; i<n; i++){
            soma = soma + vet[i];
        }

        double media = soma / n;

        System.out.printf("\nMedia do vetor = %.3f\n", media);
        System.out.println("Elementos da media: ");

        for (int i=0; i<n; i++){
            if (vet[i] < media){
                System.out.printf("%.1f\n", vet[i]);
            }
        }

        sc.close();
    }
}
