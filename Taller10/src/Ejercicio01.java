
/** *
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar su procesamiento para presentar los elementos:
 *
 * De la diagonal principal.
 * De la diagonal segundaria.
 * Ubicados bajo la diagonal principal.
 * Ubicados sobre la diagonal principal.
 * Ubicados bajo la diagonal secundaria.
 * Ubicados sobre la diagonal secundaria.
 *
 * @author Dava
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        int m = 5; //
        int[][] matriz = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 100) + 1;
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("Diagonal Principal: ");
        for (int i = 0; i < m; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.print("Diagonal Secundaria: ");
        for (int i = 0; i < m; i++) {
            System.out.print(matriz[i][m - 1 - i] + " ");
        }

        System.out.print("\nBajo la Diagonal Principal: ");
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.print("Sobre la Diagonal Principal: ");
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.print("\nBajo la Diagonal Secundaria: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j > m - 1) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }

        System.out.print("Sobre la Diagonal Secundaria: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j < m - 1) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }
}
/***
 * Matriz:
2	61	24	91	46	
2	92	92	33	64	
76	99	59	65	33	
7	74	9	38	89	
41	73	17	23	49	
Diagonal Principal: 2 92 59 38 49 Diagonal Secundaria: 46 33 59 74 41 
Bajo la Diagonal Principal: 2 76 99 7 74 9 41 73 17 23 Sobre la Diagonal Principal: 61 24 91 46 92 33 64 65 33 89 
Bajo la Diagonal Secundaria: 64 65 33 9 38 89 73 17 23 49 Sobre la Diagonal Secundaria: 2 61 24 91 2 92 92 76 99 7 BUILD SUCCESSFUL (total time: 0 seconds)

 */