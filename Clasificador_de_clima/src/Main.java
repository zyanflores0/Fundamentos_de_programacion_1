import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grados;

        System.out.print("Ingresa la temperatura en °C: ");
        grados = sc.nextDouble();

        if (grados >= 30) {
            System.out.println("Calor extremo");
        } else if (grados >= 21) {
            System.out.println("Clima agradable");
        } else if (grados >= 10) {
            System.out.println("Clima fresco");
        } else {
            System.out.println("Frío extremo");
        }
    }
}