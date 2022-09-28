package tasks.task1;

import java.util.Scanner;

public class WelcomingNumbers {
    public static void main (String [] arg){
        System.out.println("Введите число: ");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        if (number > 7)
            System.out.println("Привет");
    }
}
