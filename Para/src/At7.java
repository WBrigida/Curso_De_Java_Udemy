import java.util.Scanner;

public class At7 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro positivo, para mostrar o número da linha, depois o quadrado e o cubo do valor:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {


            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", i, segundo, terceiro);
        }

        sc.close();
    }
}