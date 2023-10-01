package classe;

import java.util.Scanner;

public class Ex3Calculadora {
    public static void main(String[] args) {
        //Fiz o mesmo em React, se puder da uma conferida depois

        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora 🧮");
        boolean continua = true;

        while (continua) {
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado = calcular(numero1, operador, numero2);

        System.out.println("Resultado: " + resultado);
        System.out.println("--------------------------------");
        System.out.println("Deseja fazer outra conta? (S/N): ");
        char resposta = scanner.next().charAt(0);
        if (resposta != 'S' && resposta != 's'){
            continua = false;
        }
    }
        System.out.println("Calculo encerrado! ");
        scanner.close();
    }
    public static double calcular(double num1, char operador, double num2) {
        double resultado = 0;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Operador inválido.");
        }
        return resultado;
    }
}
