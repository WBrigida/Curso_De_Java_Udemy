import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vet = new double[n];
        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double maior = vet [0];
        int posmaior = 0;

        for (int i=0; i<n; i++){
            if (vet[i] > maior){
                maior= vet[i];
                posmaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

        sc.close();
    }
}
