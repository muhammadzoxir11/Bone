package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Test {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(in);
        String[] arr = new String[100];
        int count = 0;

        for (; ; ) {
            System.out.println("add-> 1");
            System.out.println("list-> 2");
            System.out.print("= ");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    scanner = new Scanner(in);
                    System.out.print("name: ");
                    String name = scanner.nextLine();

                    arr[count] = name;
                    count++;
                }
                case 2 -> {
                    for (int i = 0; i < count; i++) {
                        System.out.println(arr[i]);

                    }
                }


            }

        }


    }
}
