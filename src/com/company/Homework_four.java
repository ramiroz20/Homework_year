package com.company;


import java.util.Scanner;




class Main {

    public static void main(String[] args) {
        System.out.println("Введите год в формате 2004");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 100 == 0 && year % 400 == 0)
            System.out.println("количество дней в году: 366");

        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println("количество дней в году: 366");

        else if (year % 100 == 0)
            System.out.println("количество дней в году: 365");

        else
            System.out.println("количество дней в году: 365");
    }

}