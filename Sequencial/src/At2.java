import java.util.Scanner;

public class At2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;
        System.out.printf("Area = %.4f%n" , area);

        sc.close();
    }
}
