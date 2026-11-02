public class Main {

    public static void main(String[] args) {

        mostrarEtiqueta(24680, "Temixco", 4.5);
        mostrarEtiqueta(13579, "Cuernavaca", 7.3);
    }

    static void mostrarEtiqueta(int numeroGuia, String destino, double peso) {

        System.out.println("ETIQUETA DEL PAQUETE");
        System.out.println("Numero de guia: " + numeroGuia);
        System.out.println("Ciudad de destino: " + destino);
        System.out.println("Peso del paquete: " + peso + " kg");
        System.out.println();
    }

}
