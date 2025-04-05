import java.util.Scanner;

public class triquitriqui {

    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        char jugadorActual = 'X';
        int turnos = 0;

        System.out.println("bienvenido al juego de triqui");
        System.out.println("jugador 1: X  |  Jugador 2: O");

        while (true) {
            imprimirTablero(tablero);
            System.out.println("turno del jugador " + (jugadorActual == 'X' ? "1 (X)" : "2 (O)"));
            System.out.print("ingrese la fila (1-3): ");
            int fila = miobj.nextInt() - 1;
            System.out.print("ingrese la columna (1-3): ");
            int columna = miobj.nextInt() - 1;

            if (fila < 0 || fila > 2 || columna < 0 || columna > 2 || tablero[fila][columna] != ' ') {
                System.out.println("posición inválida o ya ocupada. Intente de nuevo.");
                continue;
            }

            tablero[fila][columna] = jugadorActual;
            turnos++;

            if (verificarGanador(tablero, jugadorActual)) {
                imprimirTablero(tablero);
                System.out.println("el jugador " + (jugadorActual == 'X' ? "1 (X)" : "2 (O)") + " gana");
                break;
            }

            if (turnos == 9) {
                imprimirTablero(tablero);
                System.out.println("empate");
                break;
            }

            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }

        
    }

    public static void imprimirTablero(char[][] tablero) {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tablero[i][j] + " ");
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("---+---+---");
        }
        System.out.println();
    }

    public static boolean verificarGanador(char[][] t, char f) {
        for (int i = 0; i < 3; i++) {
            if (t[i][0] == f && t[i][1] == f && t[i][2] == f) return true;
            if (t[0][i] == f && t[1][i] == f && t[2][i] == f) return true;
        }
        return (t[0][0] == f && t[1][1] == f && t[2][2] == f) ||
               (t[0][2] == f && t[1][1] == f && t[2][0] == f);
    }
}