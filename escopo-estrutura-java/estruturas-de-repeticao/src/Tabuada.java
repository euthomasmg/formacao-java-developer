import java.util.Scanner;

public class Tabuada {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        for (int j = 1; j <= 10; j++){

            for (int i = 1; i <= 10; i++) {

                System.out.println(j + " x " + i + " = " + j * i);
            }
        }
    }
}
