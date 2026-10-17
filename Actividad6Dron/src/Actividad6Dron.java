import java.util.Scanner;

public class Actividad6Dron {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int bateria;
        int min = 1;

        System.out.println("Ingresa la bateria inicial del dron:");
        bateria = teclado.nextInt();

        if (bateria < 0 || bateria > 100) {
            System.out.println("Error, bateria no valida");
        } else {
            while (bateria >= 7) {
                bateria = bateria - 7;
                System.out.println("Minuto " + min + "-" + bateria + "%");
                min = min + 1;
            }
        }
    }
}