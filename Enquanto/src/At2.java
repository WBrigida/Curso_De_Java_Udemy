import java.util.Scanner;

public class At2 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas  de uma quantidade indeterminada de pontos no sistema cartesiano:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0){
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
