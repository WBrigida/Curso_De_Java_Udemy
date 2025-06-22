import java.util.Scanner;

public class At1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int x = sc.nextInt();

        System.out.println("Dgite o segundo valor");
        int y = sc.nextInt();

        int soma = x + y;
        System.out.println("Soma = " + soma);

        sc.close();
    }
}
