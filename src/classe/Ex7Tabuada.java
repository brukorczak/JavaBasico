package classe;

import java.util.Scanner;

public class Ex7Tabuada {
    public static void main(String[] args) {
        //7: Tabuada
        //Peça ao usuário para inserir um número e exiba a tabuada desse número de 1 a 10.
        System.out.println("TABUADA");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o 1º num: ");
        int num = scanner.nextInt();

        System.out.println("A tabuada do " + num + " é: ");
        int multi = 0;
        while(multi <= 10){
            int total = multi * num;
            System.out.println(num + " x "+ multi + ": "+ total);
            multi++;
        }
        scanner.close();
    }
}
