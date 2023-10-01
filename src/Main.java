import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("SOMA");

        Scanner primeiroNum = new Scanner(System.in);
        System.out.print("Digite o 1º num: ");
        double primeiro = primeiroNum.nextDouble();

        Scanner segundoNum = new Scanner(System.in);
        System.out.print("Digite o 2º num: ");
        double segundo = segundoNum.nextDouble();

        double soma = primeiro + segundo;

        System.out.println("A soma de " + primeiro + " + " + segundo + " é: " + soma);
    }
}