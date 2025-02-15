import java.util.Scanner;

public class Clase2_Suma2Numeros {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que sume dos números ingresados por el usuario.");

        int num1;
        int num2;

        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Por favor ingrese otro numero");
        num2 = leer.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma de " +num1+" + " +num2 + " es igual a "+suma);




    }
}
