import java.util.Scanner;

public class Calificaciones {

    static Scanner sc = new Scanner(System.in);
    public static int[] capturar() {

        int n[] = new int[10];

        for (int i = 0; i < 10; i++) {

            do {
                System.out.print("Calificacion del alumno " + (i + 1) + ": ");
                n[i] = sc.nextInt();

                if (n[i] < 0 || n[i] > 100) {
                    System.out.println("Calificacion incorrecta, intenta otra vez.");
                }

            } while (n[i] < 0 || n[i] > 100);
        }

        return n;
    }

    public static void mostrar(int n[]) {

        System.out.println("\nCalificaciones capturadas:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + n[i]);
        }
    }

    public static int aprobados(int n[]) {

        int a = 0;

        for (int i = 0; i < 10; i++) {
            if (n[i] >= 70) {
                a++;
            }
        }

        return a;
    }

    public static int reprobados(int n[]) {

        int r = 0;

        for (int i = 0; i < 10; i++) {
            if (n[i] < 70) {
                r++;
            }
        }

        return r;
    }

    public static void main(String[] args) {

        int n[] = capturar();

        mostrar(n);

        System.out.println("\nAlumnos aprobados: " + aprobados(n));
        System.out.println("Alumnos reprobados: " + reprobados(n));
    }
}
