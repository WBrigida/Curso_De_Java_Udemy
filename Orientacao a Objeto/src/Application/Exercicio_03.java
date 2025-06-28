package Application;

import Entities.Ex3;
import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Ex3 student = new Ex3();

        System.out.print("Student's name: ");
        student.name = sc.nextLine();
        System.out.print("First note: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Second note: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Third note: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("Final Grade: %.2f%n ", student.finalGrade());

        if (student.finalGrade() < 60.0){
            System.out.println("Failed");
            System.out.printf("Missing %.2f Points%n", student.missingPoints());
        }
        else {
            System.out.println("Pass");
        }

        sc.close();
    }
}
