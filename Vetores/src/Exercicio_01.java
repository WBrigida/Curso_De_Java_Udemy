import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Numeros Negativos: ");
        for (int i=0;i<n; i++){
            if (vet[i] < 0){
                System.out.printf("%d\n", vet[i]);
            }
        }
        sc.nextInt();
    }
    }

