package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static Scanner scanner = new Scanner(in);

    public static void main(String[] args) {
        // write your code here


        String[] boneName = new String[100];
        String[] boneCart = new String[100];
        int boneCount = 0;
        System.out.println("Bone");


        while (true) {

            System.out.println("Add Card -> [1]");
            System.out.println("Phone payment -> [2]");
            System.out.println("Cart payment -> [3]");
            System.out.println("Communal payment -> [4]");
            System.out.println("Cashback Card -> [5]");
            System.out.println("Card -> [6]");
            System.out.print("= ");
            int n = scanner.nextInt();

            switch (n) {
                case 1 -> {

                    addCard(boneName, boneCart, boneCount);
                    boneCount++;
                    int money = scanner.nextInt();
                    int cash = money*2/100;
                }
                case 6 -> {

                    card(boneName, boneCart, boneCount);
                }


            }


        }

    }

    private static void card(String[] boneName, String[] boneCard, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(boneName[i]);
            System.out.println(boneCard[i]);

        }

    }


    public static void addCard(String[] boneName, String[] boneCard,
                               int boneCount) {
        System.out.print("User Name write: ");
        scanner = new Scanner(in);
        String nameUser = scanner.nextLine();
        System.out.print("Card number write: ");
        String cart = scanner.nextLine();
        if (nameUser.length() >= 4 && cart.length() >= 4) {

            for (int i = 0; i < boneCount; i++) {
                boneName[i] = nameUser;
                boneCard[i] = cart;
            }


            System.out.println("Success!!!");
            System.out.println();


        } else {
            System.out.println("name or cart numbers less!!!! ");
        }

    }
}