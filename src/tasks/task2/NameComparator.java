package tasks.task2;

import java.util.Scanner;

public class NameComparator {

    public static void main (String [] arg){
        String nameToCompare = "Вячеслав";
        System.out.println("Введите имя: ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        if (name.equals (nameToCompare))
            System.out.println("Привет, Вячеслав");
                    else System.out.println("Нет такого имени");
    }
}
