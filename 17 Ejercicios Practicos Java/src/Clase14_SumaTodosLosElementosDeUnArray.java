import java.util.Scanner;

public class Clase14_SumaTodosLosElementosDeUnArray {
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

        int suma = 0;
        for(int i = 0; i < t; i++){
            suma += array[i];
        }

        System.out.println("La suma de los elementos es: " + suma);
    }
}
