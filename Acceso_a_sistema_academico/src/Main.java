import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double calificacion, porcentaje;

        System.out.print("Ingresa el promedio: ");

        calificacion = sc.nextDouble();

        System.out.print("Ingresa la asistencia (%): ");
        porcentaje = sc.nextDouble();

        if (calificacion >= 7.0) {
            if (porcentaje >= 80) {
                System.out.println("Aprobado regular");
            } else {
                System.out.println("Reprobado por faltas");
            }
        } else {
            System.out.println("Reprobado por calificación");
        }
    }
}