import java.util.Scanner;

public class At1 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int x = sc.nextInt();

        if (x <= 0 ){
            System.out.println("Negativo");
        }
        else {
            System.out.println("Positivo");
        }

        sc.close();

    }
}
