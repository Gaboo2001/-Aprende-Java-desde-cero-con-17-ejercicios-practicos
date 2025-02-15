import java.util.Scanner;

public class Clase12_EncuentraElNumeroMasGrandeDeUnArray {
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

        int mayor = array[0];

        for(int i = 1; i < t; i++){
            if(array[i] > mayor){
                mayor = array[i];
            }
        }

        System.out.println("El elemento más grande del array es: " + mayor);
    }
}
