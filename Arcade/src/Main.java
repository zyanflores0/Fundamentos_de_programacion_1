
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int horas;
        int autos = 0;
        int desc = 0;
        double pago;
        double total = 0;
        double prom;

        System.out.println("Ingresa las horas estacionado (0 para terminar):");
        horas = teclado.nextInt();

        while (horas != 0) {

            if (horas < 0) {
                System.out.println("Las horas no son validas");
            } else {

                pago = horas * 15;

                if (horas > 5) {
                    pago = pago - 10;
                    desc = desc + 1;
                }

                System.out.println("El pago del automovil es: $" + pago);

                autos = autos + 1;
                total = total + pago;

            }

            System.out.println("Ingresa las horas estacionado (0 para terminar):");
            horas = teclado.nextInt();

        }

        System.out.println("Total de automoviles atendidos: " + autos);
        System.out.println("Total de dinero recaudado: $" + total);
        System.out.println("Automoviles con descuento: " + desc);

        if (autos > 0) {
            prom = total / autos;
            System.out.println("Promedio pagado por automovil: $" + prom);
        } else {
            System.out.println("No se registraron automoviles");
        }
    }
}
