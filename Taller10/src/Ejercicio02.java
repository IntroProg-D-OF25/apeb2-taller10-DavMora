
/** *
 *Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros aleatorios, desarrollar su procesamiento para calcular y presentar:

La suma de las dos matrices (considerar las restricciones matemáticas para ello).
La multiplicación de las dos matrices (considerar las reglas matemáticas para ello).
 * @author Dava
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        int filasA = 3, columnasA = 3;
        int filasB = 3, columnasB = 3;

        int[][] matrizA = new int[filasA][columnasA];
        int[][] matrizB = new int[filasB][columnasB];
        int[][] matrizSuma = new int[filasA][columnasA];
        int[][] matrizMultiplicacion = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                matrizA[i][j] = (int) (Math.random() * 10) + 1;
            }
        }

        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                matrizB[i][j] = (int) (Math.random() * 10) + 1;
            }
        }

        System.out.println("Matriz A:");
        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasA; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz B:");
        for (int i = 0; i < filasB; i++) {
            for (int j = 0; j < columnasB; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }

        if (filasA == filasB && columnasA == columnasB) {
            System.out.println("\nSuma de las matrices A + B:");
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    matrizSuma[i][j] = matrizA[i][j] + matrizB[i][j];
                    System.out.print(matrizSuma[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nNo se puede sumar las matrices");
        }

        if (columnasA == filasB) {
            System.out.println("\nMultiplicacion de las matrices A * B:");
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasB; j++) {
                    matrizMultiplicacion[i][j] = 0;
                    for (int k = 0; k < columnasA; k++) {
                        matrizMultiplicacion[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                    System.out.print(matrizMultiplicacion[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nNo se puede multiplicar las matrices");
        }
    }
}
/***
 * Matriz A:
9	6	7	
7	5	2	
4	8	2	

Matriz B:
7	6	1	
7	6	2	
2	10	5	

Suma de las matrices A + B:
16	12	8	
14	11	4	
6	18	7	

Multiplicacion de las matrices A * B:
119	160	56	
88	92	27	
88	92	30	
 */