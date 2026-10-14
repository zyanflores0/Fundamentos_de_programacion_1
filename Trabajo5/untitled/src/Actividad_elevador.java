import java.util.Scanner;
public class Actividad_elevador {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int piso;
        int destino;

        System.out.print("Ingresa en que piso estas: ");
        piso = leer.nextInt();
        while (piso < 1 || piso > 10) {
            System.out.println("Piso no valido");
            System.out.print("Ingresa otro piso: ");
            piso = leer.nextInt();
        }
        System.out.print("Ingresa a que piso quieres ir: ");
        destino = leer.nextInt();
        while (destino < 1 || destino > 10) {
            System.out.println("Error piso no valido");
            System.out.print("Ingresa otro piso: ");
            destino = leer.nextInt();
        }
        if (piso < destino) {
            System.out.println("Subiendo elevador");
            for (int i = piso + 1; i <= destino; i++) {
                System.out.println("Pasaste por el piso " + i);
            }
        } else if (piso > destino) {
            System.out.println("Bajando elevador");
            for (int i = piso - 1; i >= destino; i--) {
                System.out.println("Pasaste por el piso " + i);
            }
        } else {
            System.out.println("Ya estas en ese piso");
        }
        System.out.println("Llegaste a tu destino");
        leer.close();
    }
}