
import java.util.Scanner;

/**
 * *
 * Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3.
 * Permita a dos jugadores marcar sus movimientos alternativamente. El juego
 * debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 *
 * @author Dava
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        String[][] tablero = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
        Scanner teclado = new Scanner(System.in);
        String jugador = "X";
        int fila, columna;

        while (true) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j]);
                    if (j < 2) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
                if (i < 2) {
                    System.out.println("---------");
                }
            }

            System.out.println("Turno del jugador " + jugador);
            System.out.print("Fila (0-2): ");
            fila = teclado.nextInt();
            System.out.print("Columna (0-2): ");
            columna = teclado.nextInt();

            if (tablero[fila][columna].equals(" ")) {
                tablero[fila][columna] = jugador;

                for (int i = 0; i < 3; i++) {
                    if ((tablero[i][0].equals(jugador) && tablero[i][1].equals(jugador) && tablero[i][2].equals(jugador))
                            || (tablero[0][i].equals(jugador) && tablero[1][i].equals(jugador) && tablero[2][i].equals(jugador))) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print(tablero[j][0]);
                            if (j < 2) {
                                System.out.print(" | ");
                            }
                        }
                        System.out.println();
                        System.out.println("El jugador " + jugador + " ha ganado");
                        teclado.close();
                        return;
                    }
                }

                if ((tablero[0][0].equals(jugador) && tablero[1][1].equals(jugador) && tablero[2][2].equals(jugador))
                        || (tablero[0][2].equals(jugador) && tablero[1][1].equals(jugador) && tablero[2][0].equals(jugador))) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablero[j][0]);
                        if (j < 2) {
                            System.out.print(" | ");
                        }
                    }
                    System.out.println();
                    System.out.println("El jugador " + jugador + " ha ganado");
                    teclado.close();
                    return;
                }

                boolean empate = true;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (tablero[i][j].equals(" ")) {
                            empate = false;
                            break;
                        }
                    }
                }
                if (empate) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablero[j][0]);
                        if (j < 2) {
                            System.out.print(" | ");
                        }
                    }
                    System.out.println();
                    System.out.println("Empate");
                    teclado.close();
                    return;
                }

                jugador = jugador.equals("X") ? "O" : "X";
            } else {
                System.out.println("Casilla ocupada, Intenta de nuevo");
            }
        }
    }
}
/***
 * run:
  |   |  
---------
  |   |  
---------
  |   |  
Turno del jugador X
Fila (0-2): 1
Columna (0-2): 1
  |   |  
---------
  | X |  
---------
  |   |  
Turno del jugador O
Fila (0-2): 2
Columna (0-2): 2
  |   |  
---------
  | X |  
---------
  |   | O
Turno del jugador X
Fila (0-2): 0
Columna (0-2): 1
  | X |  
---------
  | X |  
---------
  |   | O
Turno del jugador O
Fila (0-2): 1
Columna (0-2): 2
  | X |  
---------
  | X | O
---------
  |   | O
Turno del jugador X
Fila (0-2): 2
Columna (0-2): 1
  |   |  
El jugador X ha ganado
 */