package classe;

import java.util.Random;
import java.util.Scanner;

public class Ex10Advinhacao {
    public static void main(String[] args) {
        //10: Adivinhação de Números
        //Crie um jogo onde o computador escolhe um número aleatório entre 1 e 100, e o usuário tem que adivinhar o número. O programa deve dar dicas se o número é maior ou menor, até que o usuário acerte.

        System.out.println("ADVINHAÇÃO");
        Scanner scanner = new Scanner(System.in);
        Random numRandom = new Random();

        while (true) {
            int numAleatorio = numRandom.nextInt(100) + 1;
            int tentativas = 0;

            System.out.println("Tente advinhar o número de 1 a 100");

            while (true) {
                System.out.print("😯Digite o número: ");
                int escolha = scanner.nextInt();
                tentativas++;

                if (escolha < 1 || escolha > 100) {
                    System.out.println("Por favor digite um número entre 1 e 100");
                    continue;
                }

                if (escolha < numAleatorio) {
                    System.out.println("O número é maior. Tente de novo");
                } else if (escolha > numAleatorio) {
                    System.out.println("O número é menor. Tente de novo");
                } else {
                    System.out.println("Parabens 🎉🥳 Você acertou o número " + numAleatorio + " em " + tentativas + " tentativas ");
                    break;
                }
            }

            System.out.println("Deseja jogar novamente? (s/n)");
            String continua = scanner.next().toLowerCase();
            if (!continua.equals("s")){
                break;
            }
        }
        System.out.println("Programa Encerrado!");
        scanner.close();
    }
}
