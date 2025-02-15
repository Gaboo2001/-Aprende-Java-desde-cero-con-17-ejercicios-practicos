import java.util.Scanner;

public class Clase5_NumeroMayor {
    public static void main(String[] args) {
        System.out.println("Encuentra el número más grande entre tres números.");

        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingrese el 1° numero");
        int num1 = leer.nextInt();
        System.out.println("Por favor ingrese el 2° numero");
        int num2 = leer.nextInt();
        System.out.println("Por favor ingrese el 3° numero");
        int num3 = leer.nextInt();

        System.out.println("Los numeros ingresados fueron " +num1+ " "+ num2+ " " + num3);

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero " +num1+ " es el mayor");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("El numero " +num2+ " es el mayor");
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println("El numero " +num3+" es el mayor");
        }

    }
}
