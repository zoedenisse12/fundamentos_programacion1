import java.util.Scanner;


public class Main {


    public static double calcularRenta(double tarifa, double horas) {
        double total = tarifa * horas;
        return total;
    }


    public static void mostrarComprobante(double total) {
        System.out.println("COMPROBANTE DE RENTA");
        System.out.println("Total a pagar: $" + total);
    }


    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);


        double tarifa, horas, total;


        System.out.print("Ingresa la tarifa por hora: $");
        tarifa = teclado.nextDouble();


        System.out.print("Ingresa la cantidad de horas: ");
        horas = teclado.nextDouble();


        if (tarifa > 0 && horas > 0) {


            total = calcularRenta(tarifa, horas);


            mostrarComprobante(total);


        } else {
            System.out.println("Error: La tarifa y las horas deben ser mayores que cero.");
        }
    }
}
