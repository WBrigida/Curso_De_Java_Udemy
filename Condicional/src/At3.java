import java.util.Scanner;

public class At3 {
    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int a = sc.nextInt();

        System.out.println("Digite outro valor: ");
        int b = sc.nextInt();

        if(a % b == 0 || b % a == 0){
            System.out.println("Sao Multiplos!");
        }
        else {
            System.out.println("Nao sao Multiplos!");
        }

        sc.close();
    }
}
