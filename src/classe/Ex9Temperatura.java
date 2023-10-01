package classe;

import java.util.Scanner;

public class Ex9Temperatura {
    public static void main(String[] args) {
        //9: Conversor de Temperatura
        //Crie um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa, dependendo da escolha do usuário.

        System.out.println("Temperatura");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a conversão: ");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Digite a temperatura em Celsius: ");
            float celsius = scanner.nextFloat();
            float fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        } else if (escolha == 2) {
            System.out.println("Digite a temperatura em Fahrenheit: ");
            float fahrenheit = scanner.nextFloat();
            float celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println("A temperatura em Celsius é: " + celsius);
        } else {
            System.out.println("Valor inválido, escolha 1 ou 2");
        }
        scanner.close();
    }

    public static float celsiusToFahrenheit(float celsius) {
        return (celsius * 9/5) + 32;
    }

    public static float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
