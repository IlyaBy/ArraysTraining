package tasks.task3;

import java.util.Scanner;

    public class Array {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of an array:");
            int size = sc.nextInt();
            int[] myArray = new int[size];
            System.out.println("Insert array's elements:");

            for (int i = 0; i < size; i++) {
                myArray[i] = sc.nextInt();
            }

            System.out.println("These are the numbers that are multiple of 3:");
            for (int i : myArray)
                if (i % 3 == 0)
                System.out.println(i);
        }

    }
