import java.util.Scanner;

public class Clase17_EncuentraDuplicadosEnUnArray {
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

        // Buscar elementos duplicados
        System.out.println("Elementos duplicados en el array:");
        boolean hayDuplicados = false;
        for (int i = 0; i < t; i++) {
            for (int j = i + 1; j < t; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    hayDuplicados = true;
                    break;
                }
            }
        }

        // Si no se encontraron duplicados
        if (!hayDuplicados) {
            System.out.println("No se encontraron duplicados.");
        }
    }
}
