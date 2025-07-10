import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media = 0;
        int pares = 0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n  = sc.nextInt();

        int[] vet = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        int soma = 0;
        for (int i=0; i<n; i++){
            if (vet[i] % 2 == 0){
                soma = soma + vet[i];
                pares++;
            }
        }

        if (pares ==0){
            System.out.println("Nenhum numero par");
        }
        else {
            media = (double) soma / pares;

            System.out.printf("Media dos pares = %.1f\n", media);
        }

        sc.close();

    }
}
