import java.util.Scanner;

public class Clase11_InvertirNumero {
    public static void main(String[] args) {
        System.out.println("Invertir un numero entero");
        Scanner leer = new Scanner(System.in);

        System.out.println("Por favor ingresa un numero");
        int num = leer.nextInt();

        int numeroinvertido = 0;

        while (num != 0){
            int digito = num %10;
            numeroinvertido = numeroinvertido *10 + digito;
            num /= 10;
        }
        System.out.println(numeroinvertido);

    }
}
