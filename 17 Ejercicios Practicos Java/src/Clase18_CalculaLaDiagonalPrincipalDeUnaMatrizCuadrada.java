import java.util.Scanner;

public class Clase18_CalculaLaDiagonalPrincipalDeUnaMatrizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño de la matriz
        System.out.print("Ingresa el tamaño de la matriz cuadrada (n x n): ");
        int t = scanner.nextInt();

        // Crear la matriz
        int[][] matriz = new int[t][t];

        // Solicitar los elementos de la matriz
        System.out.println("Ingresa los elementos de la matriz:");
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcular la suma de la diagonal principal
        int sumaDiagonal = 0;
        for (int i = 0; i < t; i++) {
            sumaDiagonal += matriz[i][i]; // Los elementos de la diagonal principal tienen índices iguales
        }

        // Mostrar el resultado
        System.out.println("La suma de la diagonal principal es: " + sumaDiagonal);
    }
}
