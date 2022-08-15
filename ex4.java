package com.mycompany.lista3;

public class ex4 {

    public static void main(String[] args) {
        int a = 80000;
        int b = 200000;
        int ano;

        ano = 0;
        while (a <= b) {

            ano = ano + 1;
            a = (int) (a * 0.03);
            b = (int) (b * 0.015);
        }
        System.out.println("A ultrapassa ou iguala B em " + ano + " anos");

    }

}
