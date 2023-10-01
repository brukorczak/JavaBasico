package classe;

import java.util.Scanner;

public class Ex8Palindromo {
    public static void main(String[] args) {
        //8: Verificar Palíndromo
        //Peça ao usuário para inserir uma palavra e determine se é um palíndromo (se pode ser lida da mesma forma da esquerda para a direita e vice-versa).
        System.out.println("Palindromo");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase para verificar se é um palíndromo:");
        String palin = scanner.nextLine();

        //removendo espaço em branco
        String remove = palin.replaceAll("\\s+", "");

        String reversoPalin = new StringBuilder(remove).reverse().toString();

        System.out.println("Original: " + palin);
        System.out.println("Invertido: " + reversoPalin);

        if (remove.equalsIgnoreCase(reversoPalin)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }

        scanner.close();
    }
}
