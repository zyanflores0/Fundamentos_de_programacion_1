import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        int opc;
        int puntos = 100;
        do{
            System.out.println("Selecciona una opcion e ingresala:");
            System.out.println("1.Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            opc= teclado.nextInt();

            switch (opc){
                case 1 :
                    puntos = puntos + 20;
                    System.out.println("Ganaste 20 puntos");
                    break;
                case 2 :
                    if (puntos >= 15){
                        puntos = puntos - 15;
                        System.out.println("Has gastado 15 puntos");
                    } else{
                        System.out.println("Puntos insuficientes");
                    }
                    break;
                case 3 :
                    System.out.println("Tienes" +" "+ puntos + " "+ "puntos disponibles");
                    break;
                case 4 :
                    System.out.println("Has salido del programa");
                    break;
                default:
                    System.out.println("Error opcion no valida");
                    break;
            }
        }while (opc != 4);
        System.out.println("Tus puntos restantes son:"+ puntos);


    }
}