public class SubstituirValorIndice {

    public static void main(String[] args){

        int numeros[] = {2, 67, 89, 54, 23, 98};

        for (int i = 0; i < numeros.length; i++){

            System.out.println("Os números dentro do array são " + numeros[i]);
        }

        numeros[3] = 70;

        for (int j = 0; j <= numeros.length; j++){

            System.out.println("Os números dentro do array são " + numeros[j]);
        }
    }
}
