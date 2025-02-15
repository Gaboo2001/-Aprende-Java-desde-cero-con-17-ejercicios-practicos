import java.util.Scanner;

public class Clase4_NumeroParOImpar {
    public static void main(String[] args) {
        System.out.println("Determina si un número es par o impar.");

        System.out.println("Por favor ingrese un numero sin decimal ");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();

        if (num%2 ==0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

    }
}
