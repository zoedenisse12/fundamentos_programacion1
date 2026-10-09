import java.util.Scanner;

public class RentaBicicletas {
    public static void main(String[] args) {
        Scanner bici = new Scanner(System.in);

        int opcion, horas;
        double tarifa = 0, subtotal, descuento, total;
        String tipo = "";
        boolean membresia;

        System.out.println("TIPOS DE BICICLETAS");
        System.out.println("1. Bicicleta urbana - $40 por hora");
        System.out.println("2. Bicicleta de montaña - $60 por hora");
        System.out.println("3. Bicicleta eléctrica - $90 por hora");

        System.out.print("Selecciona el tipo de bicicleta: ");
        opcion = bici.nextInt();

        switch (opcion) {
            case 1:
                tarifa = 40;
                tipo = "Bicicleta urbana";
                break;
            case 2:
                tarifa = 60;
                tipo = "Bicicleta de montaña";
                break;
            case 3:
                tarifa = 90;
                tipo = "Bicicleta eléctrica";
                break;
            default:
                System.out.println("Opción no válida");
        }

        if (opcion >= 1 && opcion <= 3) {
            System.out.print("Cantidad de horas de renta: ");
            horas = bici.nextInt();

            if (horas > 0) {
                System.out.print("¿Tiene membresía? (true/false): ");
                membresia = bici.nextBoolean();

                subtotal = tarifa * horas;

                if (membresia == true) {
                    descuento = subtotal * 0.20;
                } else {
                    descuento = 0;
                }

                total = subtotal - descuento;

                System.out.println("Tipo de bicicleta: " + tipo);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + total);

            } else {
                System.out.println("La cantidad de horas debe ser mayor que cero");
            }
        }

        bici.close();
    }
}