package ArrayELista.Exercicios.Matriz;

import java.util.Scanner;

public class Ex1Matriz {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Linha");
        var m = sc.nextInt();
        System.out.println("Coluna");
        var n = sc.nextInt();

        Integer[][] matriz = new Integer[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Numero");
        var c = sc.nextInt();

        System.out.println("------------------------------------------");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == c) {
                    System.out.println("Posição: " + i + "," + j);

                    if (j - 1 >= 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }

                    if (j + 1 < n) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }

                    if (i - 1 >= 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }

                    if (i + 1 < m) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }
        }

    }
}
