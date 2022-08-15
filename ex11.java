package com.mycompany.lista3;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira dois valores inteiros: ");

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

        int soma = 0;

        for (int i = a; i <= b; i++) {
            soma += i;
        }

        System.out.println("Soma: " + soma);
    }
}
