package tasks.task4;

import java.util.Scanner;

public class TestArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Insert array's elements:");

        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        /*for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] % 3 == 0) {
                System.out.println("This is the amount of numbers divisible by 3: " + myArray[j]);
            }
        }*/
        System.out.println("These are the numbers that are multiple of 3: ");
        for (int i : myArray) if (i % 3 == 0) System.out.println(i);
        }

    }


