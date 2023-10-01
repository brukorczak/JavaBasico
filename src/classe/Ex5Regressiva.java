package classe;

import java.util.Scanner;

public class Ex5Regressiva {
    public static void main(String[] args) {
        //5: Contagem Regressiva
        //Peça ao usuário para inserir um número e faça uma contagem regressiva a partir desse número até 1.

        System.out.println("Regressão");

        Scanner numScanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = numScanner.nextInt();

        System.out.println("Contagem regressiva de: " + num);
        for(int i = num; i>0; i--){
            num = (i - 1);
            System.out.println(i);
        }

        numScanner.close();
    }
}
