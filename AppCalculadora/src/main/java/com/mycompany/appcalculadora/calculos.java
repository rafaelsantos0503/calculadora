/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appcalculadora;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class calculos {
    private Scanner scanner;

    public calculos() {
        this.scanner = new Scanner(System.in);
    }

    public void iniciarCalculadora() {
        System.out.println("Bem-vindo à Calculadora de Investimentos!");
        System.out.print("Por favor, informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");

        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha a operação (1-Adição, 2-Subtração, 3-Multiplicação, 4-Divisão, 5-Radiciação, 0-Sair):");
            int opcao = scanner.nextInt();
            double num1, num2;

            switch (opcao) {
                case 1: // Adição
                    num1 = pedirNumero("Informe o primeiro número: ");
                    num2 = pedirNumero("Informe o segundo número: ");
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2: // Subtração
                    num1 = pedirNumero("Informe o primeiro número: ");
                    num2 = pedirNumero("Informe o segundo número: ");
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3: // Multiplicação
                    num1 = pedirNumero("Informe o primeiro número: ");
                    num2 = pedirNumero("Informe o segundo número: ");
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4: // Divisão
                    num1 = pedirNumero("Informe o primeiro número: ");
                    num2 = pedirNumero("Informe o segundo número: ");
                    if (num2 == 0) {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    } else {
                        System.out.println("Resultado: " + (num1 / num2));
                    }
                    break;
                case 5: // Radiciação
                    num1 = pedirNumero("Informe o número para calcular a raiz quadrada: ");
                    System.out.println("Resultado: " + Math.sqrt(num1));
                    break;
                case 0: // Sair
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        System.out.println("Obrigado por usar a Calculadora de Investimentos!");
    }

    private double pedirNumero(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextDouble();
    }
}
