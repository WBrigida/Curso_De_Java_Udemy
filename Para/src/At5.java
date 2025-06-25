import java.util.Scanner;

public class At5 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para calcular seu respectivo fatorial. :");
        int n = sc.nextInt();

        int fat = 1;

        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }
        System.out.println("O fatorial é : " + fat);

        sc.close();
    }
}
