package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        boolean done = false;
        String result;


        Scanner scan = new Scanner(System.in);

        while (done != true) {
            System.out.print("Enter your test score: ");
            int score = scan.nextInt();
            scan.nextLine();
            char grade = 'F';


            if (score > 89)
                grade = 'A';
            else if (score > 79)
                grade = 'B';
            else if (score > 69)
                grade = 'C';
            else if (score > 59)
                grade = 'D';
            else
                grade = 'F';

            if ((score % 10) < 3) {
                System.out.println(grade + "-");
            } else if ((score % 10) > 7) {
                System.out.println(grade + "+");
            } else {
                System.out.println(grade);
            }

            if (score > 69)
                System.out.println("Very good! You don't have to retake the exam!");
            else
                System.out.println("Did you even look at the book?");
        }
        System.out.print("Do you want to enter another test score? (y/n) ");
        result = scan.nextLine();
        if (result.equalsIgnoreCase("n")) {
            done = true;
        }
        System.out.println("Goodbye");
    }


}
