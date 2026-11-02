import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double tam, velocidad, tiempo;

        System.out.print("Ingresa el tamaño del archivo en MB: ");
        tam = entrada.nextDouble();

        System.out.print("Ingresa la velocidad de descarga en MB/s: ");
        velocidad = entrada.nextDouble();

        if (tam >= 0 && velocidad > 0) {

            tiempo = calcularTiempo(tam, velocidad);

            System.out.println("El tiempo estimado de descarga es: " + tiempo + " segundos");

        } else {
            System.out.println("El tamaño no puede ser negativo y la velocidad debe ser mayor que cero.");
        }

    }

    static double calcularTiempo(double tam, double velocidad) {
        double tiempo = tam / velocidad;
        return tiempo;
    }

}