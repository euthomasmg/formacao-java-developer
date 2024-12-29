public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.print("Sequência de Fibonacci: " + a + ", " + b);

        for (int i = 2; i < n; i++) {

            int proximo = a + b;

            System.out.print(", " + proximo);

            a = b;
            b = proximo;
        }
    }
}