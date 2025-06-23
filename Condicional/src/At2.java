import java.util.Scanner;

public class At2 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }

        sc.close();
    }
}
