package com.mycompany.lista3;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double popA;
        double popB;
        double taxaA;
        double taxaB;

        boolean valid = false;
        do {

            System.out.println("Entre com a população A:");
            popA = sc.nextDouble();

            if (popA > 0) {
                valid = true;
            } else {
                System.out.println("População A precisa ser maior que 0.");
            }

        } while (!valid);

        valid = false;
        do {

            System.out.println("Entre com a população B:");
            popB = sc.nextDouble();

            if (popB > 0) {
                valid = true;
            } else {
                System.out.println("População B precisa ser maior que 0.");
            }

        } while (!valid);

        valid = false;
        do {

            System.out.println("Entre com a taxa de crescimento da população A:");
            taxaA = sc.nextDouble();

            if (taxaA > 0) {
                valid = true;
            } else {
                System.out.println("Taxa de crescimento A precisa ser maior que 0.");
            }

        } while (!valid);

        valid = false;
        do {

            System.out.println("Entre com a taxa de crescimento da população B:");
            taxaB = sc.nextDouble();

            if (taxaB > 0) {
                valid = true;
            } else {
                System.out.println("Taxa de crescimento B precisa ser maior que 0.");
            }

        } while (!valid);

        int cont = 0;

        while (popA < popB) {

            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            cont++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Qtd anos:     " + cont);
    }
}
