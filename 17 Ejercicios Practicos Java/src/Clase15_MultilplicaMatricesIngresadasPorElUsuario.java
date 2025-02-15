import java.util.Scanner;

public class Clase15_MultilplicaMatricesIngresadasPorElUsuario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar las dimensiones de la primera matriz
        System.out.print("Ingresa el número de filas de la primera matriz: ");
        int filas1 = teclado.nextInt();
        System.out.print("Ingresa el número de columnas de la primera matriz: ");
        int columnas1 = teclado.nextInt();

        // Solicitar las dimensiones de la segunda matriz
        System.out.print("Ingresa el número de filas de la segunda matriz: ");
        int filas2 = teclado.nextInt();
        System.out.print("Ingresa el número de columnas de la segunda matriz: ");
        int columnas2 = teclado.nextInt();

        // Verificar si las matrices se pueden multiplicar
        if (columnas1 != filas2) {
            System.out.println("No se pueden multiplicar las matrices. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
            return;
        }

        // Crear las matrices
        int[][] matriz1 = new int[filas1][columnas1];
        int[][] matriz2 = new int[filas2][columnas2];
        int[][] resultado = new int[filas1][columnas2];

        // Solicitar los elementos de la primera matriz
        System.out.println("Ingresa los elementos de la primera matriz:");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = teclado.nextInt();
            }
        }

        // Solicitar los elementos de la segunda matriz
        System.out.println("Ingresa los elementos de la segunda matriz:");
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = teclado.nextInt();
            }
        }

        // Multiplicar las matrices
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // Mostrar la matriz resultado
        System.out.println("La matriz resultado es:");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
