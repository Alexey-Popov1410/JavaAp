package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int day = scan.nextInt();
        System.out.print("Введите месяц: ");
        int month = scan.nextInt();
        System.out.print("Введите год: ");
        int year = scan.nextInt();
        System.out.print("Ваша дата: " + day + "." + month + "." + year);

        }
    }



