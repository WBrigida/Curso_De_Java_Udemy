import java.util.Scanner;

public class At5 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo do pedido desejado, de 1 a 5: ");
        int cod = sc.nextInt();

        System.out.println("Digite a quantidade desejada: ");
        int quant = sc.nextInt();

        double total;
        if(cod == 1){
            total = quant * 4.00;
        } else if (cod == 2) {
            total = quant * 4.50;
        } else if (cod == 3) {
            total = quant * 5.00;
        } else if (cod == 4) {
            total = quant * 2.00;
        }
        else {
            total = quant * 1.50;
        }

        System.out.printf("Total = R$ %.2f%n", total);

        sc.close();
    }
}
