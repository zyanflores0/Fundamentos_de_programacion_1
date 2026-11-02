import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double tarifa, horas, total;

        System.out.println("Renta de camaras");

        System.out.print("Ingresa la tarifa por hora:");
        tarifa = entrada.nextDouble();

        System.out.print("Ingresa la cantidad de horas: ");
        horas = entrada.nextDouble();

        if (tarifa > 0 && horas > 0) {

            total = calcularRenta(tarifa, horas);

            mostrarComprobante(total);

        } else {
            System.out.println("La tarifa y las horas deben ser mayores que cero");
        }

    }

    static double calcularRenta(double tarifa, double horas) {
        double total = tarifa * horas;
        return total;
    }

    static void mostrarComprobante(double total) {
        System.out.println("Comprobande de renta");
        System.out.println("Total a pagar: " + total);
    }

}