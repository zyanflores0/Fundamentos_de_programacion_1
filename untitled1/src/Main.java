
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int puntos;
        int acumu = 0;
        int mayor = 0;
        int menorIg = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.println("Ingresa los puntos de la partida " + i);
            puntos = teclado.nextInt();

            acumu = acumu + puntos;

            if (puntos > 1000) {
                mayor++;
            } else {
                menorIg++;
            }
        }

        double promedio = acumu / 7.0;

        System.out.println("Tus puntos acumulados son: " + acumu);
        System.out.println("Tu promedio es : " + promedio);
        System.out.println("Tus partidas con mas de 1000 puntos: " + mayor);
        System.out.println("Tus partidas con 1000 puntos o menos: " + menorIg);

    }
}
