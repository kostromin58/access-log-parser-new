package ru.stepup.payments;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int number2 = new Scanner(System.in).nextInt();


        int firstNumber = 5;
        int secondNumber = 10;
        double delenie = (double) firstNumber / secondNumber;
        System.out.println(delenie);
        int umnozhenie = firstNumber * secondNumber;
        System.out.println(umnozhenie);
        int summa = firstNumber + secondNumber;
        System.out.println(summa);
        int vichitanie = firstNumber - secondNumber;
        System.out.println(vichitanie);
    }
}



