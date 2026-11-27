import java.util.Scanner;

public class calificacion {

    static int[] cal = {55, 68, 72, 90, 61, 98, 45, 77, 83, 59};

    public static void original() {
        System.out.println("calificaciones originales:");

        for (int i = 0; i < cal.length; i++) {
            System.out.println("alumno " + (i + 1) + ": " + cal[i]);
        }
    }

    public static void modif() {
        for (int i = 0; i < cal.length; i++) {
            cal[i] = cal[i] + 5;

            if (cal[i] > 100) {
                cal[i] = 100;
            }
        }
    }

    public static void res() {
        System.out.println("calificaciones modificadas:");

        for (int i = 0; i < cal.length; i++) {
            System.out.println("alumno " + (i + 1) + ": " + cal[i]);
        }
    }

    public static void aprob() {
        int cont = 0;

        for (int i = 0; i < cal.length; i++) {
            if (cal[i] >= 70) {
                cont++;
            }
        }

        System.out.println("alumnos aprobados: " + cont);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        original();
        modif();
        res();
        aprob();
    }
}

