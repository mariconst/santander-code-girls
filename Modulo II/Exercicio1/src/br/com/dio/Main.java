package br.com.dio;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valor1, valor2, juros;
        int menuInicial, menuCalculadora, parcelas, tipoJuros;
        Scanner scanner = new Scanner(System.in);
        System.out.println(Mensagem.msg());

        System.out.println("O que você deseja fazer?\n 1 - Emprestimo\n 2 - Calculadora ");
        menuInicial = scanner.nextInt();

        if(menuInicial == 1){
            System.out.println("digite o valor desejado: ");
            valor1 = scanner.nextDouble();
            System.out.println("digite o tipo de juros: \n 1 - Simples \n 2- Composto ");
            tipoJuros = scanner.nextInt();
            System.out.println("digite a taxa de juros: ");
            juros = scanner.nextDouble();
            System.out.println("digite o número de parcelas em meses: ");
            parcelas = scanner.nextInt();
            System.out.println("Total a pagar:" + Emprestimo.calcular(valor1, juros, parcelas, tipoJuros));
        } else if (menuInicial == 2) {
            System.out.println("digite o primeiro valor: ");
            valor1 = scanner.nextDouble();
            System.out.println("digite o segundo valor: ");
            valor2 = scanner.nextDouble();
            System.out.println("digite o número da operação desejada:\n 1 - Somar\n 2 - Subtrair\n 3 - Multiplicar\n 4 - Dividir ");
            menuCalculadora = scanner.nextInt();

            switch (menuCalculadora){
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
        }else {
            System.out.println("Opção inválida!");
        }


    }
}
