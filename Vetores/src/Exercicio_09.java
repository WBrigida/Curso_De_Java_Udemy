import java.util.Scanner;

public class Exercicio_09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i=0; i<n; i++){
            System.out.printf("Dados da %da pessoa: \n", i + 1 );
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int maior = idade[0];
        int posicao = 0;

        for (int i=1; i<n; i++){
            if (idade[i] > maior){
                maior = idade[i];
                posicao = i;
            }
        }

        System.out.printf("Pessoa mais velha: %s\n", nome[posicao]);

        sc.close();

        
    }
}
