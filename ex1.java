package com.mycompany.lista3;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota;
        do {
            System.out.println("Informe a Nota: ");
            nota = sc.nextFloat();
            if (nota <= 0 || nota >= 11) {

                System.out.println("Número invalido");

            } else {
                System.out.println("Valor informado válido ");

            }
        } while (nota <= 0 || nota >= 11);

    }

}
