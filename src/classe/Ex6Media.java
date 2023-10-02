package classe;

import java.util.Scanner;

public class Ex6Media {
    public static void main(String[] args) {
        //6: Média de Números
        //Peça ao usuário para inserir uma série de números e calcule a média deles.

        System.out.println("MÉDIA");

        Scanner primNumS = new Scanner(System.in);
        System.out.print("Digite a 1º nota: ");
        int primeiro = primNumS.nextInt();

        Scanner segNumS = new Scanner(System.in);
        System.out.print("Digite a 2º nota: ");
        int segundo = segNumS.nextInt();

        int media = (primeiro+segundo)/2;

        System.out.println("A média do aluno é: " + media);

        //---------------- EM FLOAT
        //Locale.setDefault(Locale.US);
        //
        //        Scanner primNumS = new Scanner(System.in);
        //        System.out.print("Digite o 1º num: ");
        //        float primeiro = primNumS.nextFloat();
        //
        //        Scanner segNumS = new Scanner(System.in);
        //        System.out.print("Digite o 2º num: ");
        //        float segundo = segNumS.nextFloat();
        //
        //        Scanner terNumS = new Scanner(System.in);
        //        System.out.print("Digite o 2º num: ");
        //        float terceiro = terNumS.nextFloat();
        //
        //        Scanner quarNumS = new Scanner(System.in);
        //        System.out.print("Digite o 2º num: ");
        //        float quarto = quarNumS.nextFloat();
        //
        //        float media = (primeiro + segundo + terceiro + quarto) / 4;
        //
        //        System.out.println("A média do aluno é: " + media);
    }
}
