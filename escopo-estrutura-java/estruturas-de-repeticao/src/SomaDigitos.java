import java.util.Scanner;

public class SomaDigitos {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = read.nextInt();

        int soma = 0;

        for (; numero != 0; numero /= 10) {

            soma += numero % 10;
        }

        System.out.println("A soma dos dígitos é: " + soma);
    }
}
