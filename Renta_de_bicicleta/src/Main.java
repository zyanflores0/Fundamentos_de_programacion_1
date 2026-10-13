import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tipo, horas;
        double precio = 0, subtotal, rebaja, total;
        String bicicleta = "", membresia;

        System.out.println("1. Bicicleta urbana - $40");

        System.out.println("2. Bicicleta de montaña - $60");
        System.out.println("3. Bicicleta eléctrica - $90");
        System.out.print("Elige una bicicleta: ");
        tipo = sc.nextInt();
        switch (tipo) {
            case 1:
                precio = 40;
                bicicleta = "Bicicleta urbana";
                break;
            case 2:
                precio = 60;
                bicicleta = "Bicicleta de montaña";
                break;
            case 3:
                precio = 90;
                bicicleta = "Bicicleta eléctrica";
                break;
            default:
                System.out.println("Opción no válida");
        }
        if (tipo >= 1 && tipo <= 3) {
            System.out.print("¿Cuántas horas la rentarás?: ");
            horas = sc.nextInt();

            if (horas > 0) {
                System.out.print("¿Tienes membresía? (si/no): ");
                membresia = sc.next();

                subtotal = precio * horas;
                if (membresia.equalsIgnoreCase("si")) {
                    rebaja = subtotal * 20 / 100;
                } else {
                    rebaja = 0;
                }
                total = subtotal - rebaja;
                System.out.println("Bicicleta: " + bicicleta);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + rebaja);
                System.out.println("Total a pagar: $" + total);
            } else {
                System.out.println("Las horas no son validas");
            }
        }
        sc.close();
    }
}