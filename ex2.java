package com.mycompany.lista3;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valid = false;
        String user;
        String passw;

        do {

            System.out.print("Entre com o nome do usuário:");
            user = sc.next();

            System.out.print("Entre com a senha:");
            passw = sc.next();

            if (user.equalsIgnoreCase(passw)) {
                System.out.println("Senha igual ao usuário, digite novamente.");
            } else {
                valid = true;
                System.out.println("Senha e usuário válidos.");
            }

        } while (!valid);
    }
}
