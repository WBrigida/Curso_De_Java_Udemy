import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

            int nmenores = 0;
            double alturatotal = 0;
        for (int i = 0; i <n; i++){
            if (idade[i] < 16){
                nmenores++;
            }
            alturatotal = alturatotal +altura[i];
        }

        double alturamedia = alturatotal / n;
        double percentMenores = ((double) nmenores / n) * 100.0;

            System.out.printf("\nAltura media = %.2f\n", alturamedia);
            System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentMenores);

            for (int i=0; i<n; i++){
                if (idade[i] < 16){
                    System.out.printf("%s\n", nome[i]);
                }
            }

            sc.close();
        }
    }

