package Application;

import Entities.Ex2;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Ex2 emp = new Ex2();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee : " + emp);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Upsated data: " + emp);

        sc.close();

    }
}
