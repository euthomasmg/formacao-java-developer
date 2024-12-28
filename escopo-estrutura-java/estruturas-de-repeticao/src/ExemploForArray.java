import java.util.Scanner;

public class ExemploForArray {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        String alunos[] = {"Thomas", "Gabby"};

        for (int i = 0; i < alunos.length; i++)
        {

            System.out.println("O aluno no indice " + i + " é " + alunos[i]);
        }
        for (String aluno : alunos){

            System.out.println("O nome do aluno é: " + aluno);
        }

    }
}
