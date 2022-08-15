package com.mycompany.lista3;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean valid = false;
        String nome, sexo, ec;
        int idade;
        double salario;

        do {

            System.out.println("Entre com o nome:");

            nome = scan.next();

            if (nome.length() >= 3) {
                valid = true;
            } else {
                System.out.println("Nome precisa no mínimo 3 caracteres.");
            }
        } while (!valid);

        valid = false;
        do {

            System.out.println("Entre com a idade:");

            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150) {
                valid = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        } while (!valid);

        valid = false;
        do {

            System.out.println("Entre com o salário:");

            salario = scan.nextDouble();

            if (salario > 0) {
                valid = true;
            } else {
                System.out.println("Salário precisa ser maior que 0.");
            }
        } while (!valid);

        valid = false;
        do {

            System.out.println("Entre com o sexo:");

            sexo = scan.next();

            if (sexo.equalsIgnoreCase("F")
                    || sexo.equalsIgnoreCase("M")) {
                valid = true;
            } else {
                System.out.println("Sexo precisa ser 'F' ou 'M'.");
            }
        } while (!valid);

        valid = false;
        do {

            System.out.println("Entre com o estado civil:");

            ec = scan.next();

            if (ec.equalsIgnoreCase("S")
                    || ec.equalsIgnoreCase("C")
                    || ec.equalsIgnoreCase("V")
                    || ec.equalsIgnoreCase("D")) {
                valid = true;
            } else {
                System.out.println("Estado civil precisa ser 'S', 'C', 'V' ou 'D'.");
            }
        } while (!valid);

        System.out.println("As seguintes informações foram coletadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + ec);
    }
}
