import java.util.Scanner;

public class Clase3_AreaDeUnTriangulo {
    public static void main(String[] args) {
        System.out.println("Calcula el área de un triángulo con base y altura ingresadas por el usuario.");

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la base");
        float base = leer.nextFloat();

        System.out.println("Ingrese la altura");
        float altura = leer.nextFloat();

        float area = (base * altura) / 2;
        System.out.println("El area del tringulo es de " + area);


    }
}
