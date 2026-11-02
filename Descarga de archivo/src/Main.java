import java.util.Scanner;


public class Main {


    public static double calcularTiempo(double tamaño, double velocidad) {
        double tiempo = tamaño / velocidad;
        return tiempo;
    }


    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);


        double tamaño, velocidad, tiempo;


        System.out.print("Ingresa el tamaño del archivo en MB: ");
        tamaño = entrada.nextDouble();


        System.out.print("Ingresa la velocidad de descarga en MB/s: ");
        velocidad = entrada.nextDouble();


        if (tamaño >= 0 && velocidad > 0) {


            tiempo = calcularTiempo(tamaño, velocidad);


            System.out.println("El tiempo estimado de descarga es: " + tiempo + " segundos");


        } else {
            System.out.println("Error: Los datos no son validos.");
        }
    }
}
