import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int bateria, minutos;
        int opcion = 1;

        while (opcion == 1) {

            System.out.println("Simulador de carga de bateria");
            System.out.print("Ingresa el porcentaje inicial de bateria: ");
            bateria = entrada.nextInt();

            if (bateria >= 0 && bateria <= 100) {

                minutos = calcularMinutos(bateria);
                System.out.println("Minutos necesarios para completar la carga: " + minutos);
            } else {
                System.out.println("El porcentaje debe estar entre 0 y 100.");
            }
            System.out.println("Deseas realizar otra simulacion");
            System.out.println("1. Si");
            System.out.println("2. No");
            System.out.print("Selecciona una opcion: ");
            opcion = entrada.nextInt();
        }
        System.out.println("Programa finalizado, hasta luego :)");
    }
    static int calcularMinutos(int bateria) {

        int minutos = 0;
        while (bateria < 100) {

            bateria = bateria + 8;
            if (bateria > 100) {

                bateria = 100;
            }
            minutos++;
        }
        return minutos;
    }

}
