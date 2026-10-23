import java.util.Scanner;
public class estacionamiento {
    public static void main(String[] args) {
        Scanner estacionamiento = new Scanner(System.in);

        int horas;
        int autos = 0;
        int descuentos = 0;
        double pago;
        double total = 0;
        double promedio;

        System.out.print("Horas estacionado (0 para terminar): ");
        horas = estacionamiento.nextInt();

        while (horas != 0) {
            if (horas < 0) {
                System.out.println("Las horas negativas no son validas");
            } else {
                pago = horas * 15;

                if (horas > 5) {
                    pago = pago - 10;
                    descuentos++;
                }

                System.out.println("El automovil debe pagar: $" + pago);

                autos++;
                total = total + pago;
            }

            System.out.print("Horas estacionado (0 para terminar): ");
            horas = estacionamiento.nextInt();
        }

        System.out.println("\nRESULTADOS DEL DIA");
        System.out.println("Automoviles atendidos: " + autos);
        System.out.println("Dinero recaudado: $" + total);
        System.out.println("Automoviles con descuento: " + descuentos);

        if (autos > 0) {
            promedio = total / autos;
            System.out.println("Promedio pagado por automovil: $" + promedio);
        } else {
            System.out.println("No se atendieron automoviles");
        }
    }
}
