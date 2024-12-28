import java.util.Scanner;

public class Fatorial {

    public static void main (String[] args){

        Scanner number = new Scanner(System.in);

        int n1, resultado = 1;

        System.out.print("Informe um número positivo: ");
        n1 = number.nextInt();

        for (int i = 1; i <= n1; i++){

            resultado *= i;
        }

        System.out.print(n1 + "! = " + resultado);

    }
}
