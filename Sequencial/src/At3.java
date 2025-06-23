import java.util.Scanner;

public class At3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os quatro valores: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int dif = (a * b - c * d);
        System.out.println("Diferença = " + dif);

        sc.close();
    }
}
