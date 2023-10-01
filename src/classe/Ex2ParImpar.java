package classe;

import java.util.Scanner;

public class Ex2ParImpar {
    public static void main(String[] args) {
        //2: Verificar Número Par ou Ímpar
        //Peça ao usuário para inserir um número e determine se é par ou ímpar.
        System.out.println("Defina se é par ou ímpar");

        Scanner numeroS = new Scanner(System.in);
        System.out.println("Insira um número e veja se é par ou ímpar: ");
        int numero = numeroS.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é: par");
        } else {
            System.out.println("O número " + numero + " é: ímpar");
        }

        // Certifique-se de fechar o scanner quando não precisar mais dele
        numeroS.close();
    }
}
