package com.company;

import java.util.Scanner;

// Qs : Write a Program to calculate percentage of a given Student in CBSE board exam.
// His marks from 5 Subjects must be taken as input from the keyboard. (Marks are out of 100).

public class Exercise1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

//        int marksWithinHundred = 100;
        System.out.println("Marks should be <= : " + 100);

        System.out.print("Enter English Marks : ");
        int marks1 = sc.nextInt();

        System.out.print("Enter Hindi Marks : ");
        int marks2 = sc.nextInt();

        System.out.print("Enter Mathematics Marks : ");
        int marks3 = sc.nextInt();

        System.out.print("Enter Science Marks : ");
        int marks4 = sc.nextInt();

        System.out.print("Enter History Marks : ");
        int marks5 = sc.nextInt();

        int obtainMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        int totalMarks = 500;

        double percentage = (obtainMarks / (double) totalMarks) * 100;

        System.out.println("The Percentage is : " + percentage + "%");
    }
}
