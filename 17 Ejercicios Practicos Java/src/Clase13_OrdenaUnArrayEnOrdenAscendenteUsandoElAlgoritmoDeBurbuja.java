import java.util.Scanner;

public class Clase13_OrdenaUnArrayEnOrdenAscendenteUsandoElAlgoritmoDeBurbuja {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el tamanio del array");

        int t = teclado.nextInt();

        int[] array = new int[t];

        System.out.println("Ingresa los elementos del array");

        for(int i = 0; i < t; i++){
            System.out.println("Elemento " + (i + 1) + ": ");

            array[i] = teclado.nextInt();
        }

        //Algoritmo burbuja
        for(int i = 0; i < t - 1; i++){
            for(int j = 0; j < t - 1 - i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];

                    array[j] = array[j+1];

                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Array ordenado en orden ascendente:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
