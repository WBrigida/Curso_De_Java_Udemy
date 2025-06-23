import java.util.Scanner;

public class At4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero do funcionario: ");
        int numero = sc.nextInt();

        System.out.println("Digite as horas trabalhadas: ");
        int horas = sc.nextInt();

        System.out.println("Digite o valor das horas trabalhadas: ");
        double valorHora = sc.nextDouble();

        double salario = horas * valorHora;
        System.out.println("Numero do funcionario: " + numero);
        System.out.printf("Salario = R$ %.2f%n" , salario );

        sc.close();
    }
}
