package com.mycompany.lista3;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        double media;
        int soma = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Insira um número");
            num = sc.nextInt();

            soma += num;
        }

        media = soma / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
