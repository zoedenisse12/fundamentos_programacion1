public class Main {


    public static void mostrarEtiqueta(String guia, String destino, double peso) {
        System.out.println("ETIQUETA DEL PAQUETE");
        System.out.println("Numero de guia: " + guia);
        System.out.println("Ciudad de destino: " + destino);
        System.out.println("Peso del paquete: " + peso + " kg");
    }


    public static void main(String[] args) {


        mostrarEtiqueta("12345", "Cuernavaca", 5.5);
        mostrarEtiqueta("67890", "Ciudad de Mexico", 3.2);


    }
}
