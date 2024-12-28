import java.util.Scanner;

public class NumerosPares {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        int resultado, soma = 0;

        for(int i = 1; i <= 50; i++){

            resultado = i * 2;

            soma += resultado;
        }
        System.out.println("A soma dos números pares de 0 a 100 é: " + soma);

    }
}
