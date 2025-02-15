import java.util.Scanner;

public class Clase16_DeterminaSiUnArrayEstaOrdenado {
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


        // Verificar si el array está ordenado
        boolean estaOrdenado = true;
        for (int i = 0; i < t - 1; i++) {
            if (array[i] > array[i + 1]) {
                estaOrdenado = false;
                break;
            }
        }

        // Mostrar el resultado
        if (estaOrdenado) {
            System.out.println("El array está ordenado en orden ascendente.");
        } else {
            System.out.println("El array no está ordenado en orden ascendente.");
        }

    }
}
