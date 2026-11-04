import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int paquetes = 1;
        int rechazados = 0;
        int aceptados = 0;
        int fragiles = 0;

        while (paquetes <= 5) {
            System.out.println("Paquete numero # " + paquetes);
            System.out.println("1. Local");
            System.out.println("2. Nacional");
            System.out.println("3. Express");
            System.out.println("Selecciona el tipo de envio del paquete:");

            int tipo = entrada.nextInt();
            System.out.println("Ingresa el peso en kg:");
            double peso = entrada.nextDouble();

            double limite = 0;

            if (tipo == 1) {
                limite = 12;
            } else if (tipo == 2) {
                limite = 20;
            } else if (tipo == 3) {
                limite = 5;
            } else {
                System.out.println("Tipo no valido");
                rechazados++;
                paquetes++;
                continue;
            }

            if (peso > 0 && peso <= limite) {
                System.out.println("Paquete aceptado");
                aceptados++;

                double costoEnvio = 0;
                if (tipo == 1) {
                    costoEnvio = 30 + (8 * peso);
                } else if (tipo == 2) {
                    costoEnvio = 50 + (12 * peso);
                } else if (tipo == 3) {
                    costoEnvio = 80 + (20 * peso);
                }

                int fragil = 0;
                while (fragil != 1 && fragil != 2) {
                    System.out.println("¿Es fragil?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    System.out.println("Ingresa la opcion:");
                    fragil = entrada.nextInt();

                    if (fragil != 1 && fragil != 2) {
                        System.out.println("Opcion no valida. Intenta de nuevo.");
                    }
                }

                if (fragil == 1) {
                    costoEnvio += 25;
                    fragiles++;
                }

                System.out.println("Costo total del envio: $" + costoEnvio);

            } else {
                System.out.println("Paquete rechazado por peso");
                rechazados++;
            }

            paquetes++;
        }

        System.out.println("res finales");
        System.out.println("Paquetes registrados: " + (aceptados + rechazados));
        System.out.println("Paquetes aceptados: " + aceptados);
        System.out.println("Paquetes rechazados: " + rechazados);
        System.out.println("Paquetes fragiles totales: " + fragiles);
    }
}