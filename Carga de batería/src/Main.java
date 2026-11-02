import java.util.Scanner;


public class Main {


    public static int calcularMinutos(int porcentaje) {
        int minutos = 0;


        while (porcentaje < 100) {
            porcentaje = porcentaje + 8;
            minutos++;


            if (porcentaje > 100) {
                porcentaje = 100;
            }
        }


        return minutos;
    }


    public static void main(String[] args) {


        Scanner lector = new Scanner(System.in);


        int porcentaje, minutos;
        int opcion = 1;


        while (opcion == 1) {


            System.out.print("Ingresa el porcentaje inicial de bateria: ");
            porcentaje = lector.nextInt();


            if (porcentaje >= 0 && porcentaje <= 100) {


                minutos = calcularMinutos(porcentaje);


                System.out.println("Minutos necesarios para completar la carga: " + minutos);


            } else {
                System.out.println("Error: El porcentaje debe estar entre 0 y 100.");
            }


            System.out.println("Deseas realizar otra simulacion?");
            System.out.println("1. Si");
            System.out.println("2. No");
            opcion = lector.nextInt();
        }


        System.out.println("Programa finalizado.");
    }
}