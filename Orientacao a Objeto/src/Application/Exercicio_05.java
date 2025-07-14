package Application;

import java.util.Scanner;
import java.text.ParseException;
import Entities.Ex5;

public class Exercicio_05 {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        Ex5[] vect= new Ex5[10];
        System.out.print("How many rooms will be rented? ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Ex5#"+ i+ ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name= sc.nextLine();
            System.out.print("Email: ");
            String email= sc.nextLine();
            System.out.print("Room: ");
            int room= sc.nextInt();
            vect[room] = new Ex5(name, email);
        }
        System.out.println();
        System.out.println("Busyrooms:");
        for(int i=0; i<10; i++) {
            if(vect[i] != null) {
                System.out.println(i+ ": "+ vect[i]);
            }
        }
        sc.close();
    }
}
