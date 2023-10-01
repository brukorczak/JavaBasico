package classe;
import java.util.Scanner;

public class Ex1Soma {
    public static void main(String[] args) {
        //1: Soma de Dois Números
        //Peça ao usuário para inserir dois números e exiba a soma deles.

        System.out.println("SOMA");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o 1º num: ");
        double primeiro = scanner.nextDouble();

        System.out.print("Digite o 2º num: ");
        double segundo = scanner.nextDouble();

        double soma = primeiro + segundo;

        System.out.println("A soma de " + primeiro + " + " + segundo + " é: " + soma);

        // Certifique-se de fechar o scanner quando não precisar mais dele
        scanner.close();
    }
}

