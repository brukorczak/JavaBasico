package classe;

import java.util.Scanner;

public class Ex4Fatorial {
    public static void main(String[] args) {
        //4: Fatorial de um Número
        //Peça ao usuário para inserir um número e calcule o fatorial desse número.
        System.out.println("Número fatorial");

        Scanner numFatorial = new Scanner(System.in);
        System.out.print("Defina um número: ");
        int numFat = numFatorial.nextInt();

        System.out.println("Fatorial de: !" + numFat);

        for (int i = numFat; i > 1; i--) {
            numFat = numFat * (i - 1);
            System.out.println(numFat);
        }
        numFatorial.close();
    }
}
