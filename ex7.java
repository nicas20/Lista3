package com.mycompany.lista3;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {

            System.out.println("Entre com um número:");
            num = sc.nextInt();

            if (num > maior) {
                maior = num;
                System.out.println("o número maior mudou: " + maior);
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
    }
}
