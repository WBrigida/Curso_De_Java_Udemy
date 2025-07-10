import java.util.Scanner;

public class Exercicio_10 {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.print("Quantos alunos serao digitado? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        double[] notas = new double[n];
        double[] notas2 = new double[n];

        for (int i=0; i<n; i++){
            System.out.printf("Digite o nome, primeira e segunda nota do %do aluno \n", i + 1);
            sc.nextLine();
            nomes[i] = sc.nextLine();
                    notas[i] = sc.nextDouble();
                    notas2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");

        for (int i=0; i<n; i++){
            double media = (notas[i] + notas2[i]) / 2;

            if (media >= 6.0){
                System.out.printf("%s\n", nomes[i]);
            }
        }

        sc.close();
    }
}
