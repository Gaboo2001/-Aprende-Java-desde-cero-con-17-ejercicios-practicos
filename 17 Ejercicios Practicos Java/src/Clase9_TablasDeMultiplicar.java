import java.util.Scanner;

public class Clase9_TablasDeMultiplicar {
    public static void main(String[] args) {
        System.out.println("Genera la tabla de multiplicar de un número dado.");
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");

        int num = leer.nextInt();

        for (int i = 1; i<11 ; i++){
            System.out.println(num + "x" + i + "=" + (num*i));
        }

    }
}
