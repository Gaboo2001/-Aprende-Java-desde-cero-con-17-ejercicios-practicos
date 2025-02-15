import java.util.Scanner;

public class Clase10_AñoBisisesto {
    public static void main(String[] args) {
        System.out.println(" Determina si un año ingresado es bisiesto");
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un año");
        int anio = leer.nextInt();

        if ((anio % 4==0 && anio % 100 !=0) || anio % 400 ==0){
            System.out.println(anio + " Es bisiesto");
        } else {
            System.out.println(anio + " No es bisiesto");
        }
    }
}
