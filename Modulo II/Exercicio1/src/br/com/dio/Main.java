package br.com.dio;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor1;
        double valor2;
        int menu;
        double total;
        Scanner scanner = new Scanner(System.in);
        System.out.println(Mensagem.msg());
        System.out.println("digite o primeiro valor: ");
        valor1 = scanner.nextDouble();
        System.out.println("digite o segundo valor: ");
        valor2 = scanner.nextDouble();
        System.out.println("digite o número da operação desejada:\n 1 - Somar\n 2 - Subtrair\n 3 - Multiplicar\n 4 - Dividir ");
        menu = scanner.nextInt();

        switch (menu){
            case 1:
                System.out.println(Calculadora.somar(valor1, valor2));
                break;
            case 2:
                System.out.println(Calculadora.subtrair(valor1, valor2));
                break;
            case 3:
                System.out.println(Calculadora.multiplicar(valor1, valor2));
                break;
            case 4:
                System.out.println(Calculadora.dividir(valor1,valor2));
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
