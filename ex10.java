package com.mycompany.lista3;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira dois numeros inteiros: ");

        int a = sc.nextInt();

        int b = sc.nextInt();

        int menor;

        if (a < b) {
            menor = a;
        } else {
            menor = b;
        }

        int diferenca = Math.abs(a - b);

        for (int i = 1; i < diferenca; i++) {
            System.out.print(menor + i + " ");
        }

    }

}
