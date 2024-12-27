public class BreackContinue {

    public static void main (String[] args) {

        //o brank para o for quando o if e a condição dele for verdadeira.

        for (int i = 1; i <= 5; i++){

            if (i == 3){
                break;
            }
            System.out.println(i);
        }

        //quando usar o continue, ele vai pular um numero do contador, nesse caso.

        for (int i = 1; i <= 5; i++){

            if (i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
