import java.util.Scanner;

public class JuegoDelGato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] tablero = new char[3][3];
        int fila, columna;
        char jugadorActual = 'X';
        boolean juegoTerminado = false;

        // Inicializar el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }

        // Juego
        while (!juegoTerminado) {
            // Mostrar el tablero
            System.out.println("Tablero:");
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            // Pedir la jugada al jugador actual
            System.out.println("Turno del jugador " + jugadorActual + ".");
            System.out.print("Ingrese la fila (1-3): ");
            fila = sc.nextInt() - 1;
            System.out.print("Ingrese la columna (1-3): ");
            columna = sc.nextInt() - 1;

            // Validar la jugada
            if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == '-') {
                tablero[fila][columna] = jugadorActual;

                // Verificar si el jugador actual ganó
                if (tablero[fila][0] == jugadorActual && tablero[fila][1] == jugadorActual && tablero[fila][2] == jugadorActual
                        || tablero[0][columna] == jugadorActual && tablero[1][columna] == jugadorActual && tablero[2][columna] == jugadorActual
                        || fila == columna && tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual
                        || fila + columna == 2 && tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
                    System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                    juegoTerminado = true;
                } else {
                    // Cambiar al jugador siguiente
                    jugadorActual = jugadorActual == 'X' ? 'O' : 'X';
                }
            } else {
                System.out.println("Jugada invalida. Inténtelo de nuevo.");
            }

            // Verificar si el juego terminó en empate
            if (!juegoTerminado) {
                juegoTerminado = true;
                for (int i = 0; i < tablero.length; i++) {
                    for (int j = 0; j < tablero[i].length; j++) {
                        if (tablero[i][j] == '-') {
                            juegoTerminado = false;
                            break;
                        }
                    }
                    if (!juegoTerminado) {
                        break;
                    }
                }
                if (juegoTerminado)
                    System.out.println("¡El juego ha terminado en empate!");
                }}}}