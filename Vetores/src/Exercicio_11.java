import java.util.Scanner;

public class Exercicio_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i=0; i<n; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        double menor = altura[0];
        double maior = altura[0];

        for (int i=0; i<n; i++){
            if (altura[i] > maior){
                maior = altura[i];
            }
            if (altura[i] < menor){
                menor = altura[i];
            }
        }

        int qtdhomen = 0;
        int qtdmulher = 0;
        double alturafem = 0;

        for (int i=0; i<n; i++){
            if (genero[i] == 'M'){
                qtdhomen++;
            }
            else {
                qtdmulher++;
                alturafem = alturafem + altura[i];
            }
        }
        double mediafem = alturafem / qtdmulher;

        System.out.printf("Menor altura = %.2f\n", menor);
        System.out.printf("Maior altura = %.2f\n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f\n", mediafem);
        System.out.printf("Numero de homens = %d\n", qtdhomen);

        sc.close();
    }
}
