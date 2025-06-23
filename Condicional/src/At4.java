import java.util.Scanner;

public class At4 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora que o jogo começou: ");
        int horaInicial = sc.nextInt();

        System.out.println("Digite a hora que o jogo acabou: ");
        int horaFinal = sc.nextInt();

        int duracao;
        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
            System.out.println("O jogo durou " + duracao + " Hora(s)");
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
            System.out.println("O jogo durou " + duracao + " Hora(s)");
        }

        sc.close();

    }
}
