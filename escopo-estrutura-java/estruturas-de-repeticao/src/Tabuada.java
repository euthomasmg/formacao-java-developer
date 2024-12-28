import java.util.Scanner;

public class Tabuada {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        int n1;

        System.out.print("Informe um número inteiro: ");
        n1 = read.nextInt();

        for(int i = 1; i <= 10; i++){

            System.out.println(n1 + " x " + i + " = " + n1 * i);
        }

    }
}
