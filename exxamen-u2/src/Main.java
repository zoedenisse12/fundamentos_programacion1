import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int peso;
        int tipo;
        int fragil;

        int aceptados = 0;
        int rechazados = 0;
        int fragiles = 0;

        double costo;
        double totalRecaudado = 0;
        double costoMayor = 0;

        String nombreTipo = "";

        System.out.println("REGISTRO DE PAQUETES");

        System.out.print("Ingresa el peso del paquete (0 para terminar): ");
        peso = entrada.nextInt();

        while (peso != 0) {

            if (peso < 0) {

                System.out.println("Peso negativo, intenta nuevamente.");

            } else {

                do {
                    System.out.println("Tipo de envio:");
                    System.out.println("1. Local");
                    System.out.println("2. Nacional");
                    System.out.println("3. Express");
                    System.out.print("Selecciona una opcion: ");
                    tipo = entrada.nextInt();

                } while (tipo < 1 || tipo > 3);

                int maximo = 0;

                switch (tipo) {
                    case 1:
                        nombreTipo = "Local";
                        maximo = 12;
                        costo = 30 + (8 * peso);
                        break;

                    case 2:
                        nombreTipo = "Nacional";
                        maximo = 20;
                        costo = 50 + (12 * peso);
                        break;

                    default:
                        nombreTipo = "Express";
                        maximo = 5;
                        costo = 80 + (20 * peso);
                        break;
                }

                if (peso > maximo) {

                    System.out.println("Paquete rechazado");
                    rechazados++;

                } else {

                    do {
                        System.out.print("El paquete es fragil? 1.Si 2.No: ");
                        fragil = entrada.nextInt();

                    } while (fragil != 1 && fragil != 2);

                    if (fragil == 1) {
                        costo = costo + 25;
                        fragiles++;
                    }

                    aceptados++;

                    totalRecaudado = totalRecaudado + costo;

                    if (costo > costoMayor) {
                        costoMayor = costo;
                    }

                    System.out.println("Paquete aceptado");
                    System.out.println("Tipo de envio: " + nombreTipo);
                    System.out.println("Peso: " + peso + " kg");
                    System.out.println("Total a pagar: $" + costo);
                }
            }

            System.out.println();

            System.out.print("Ingresa el peso del siguiente paquete (0 para terminar): ");
            peso = entrada.nextInt();
        }

        System.out.println("\nRESULTADOS FINALES");
        System.out.println("Paquetes aceptados: " + aceptados);
        System.out.println("Paquetes rechazados: " + rechazados);
        System.out.println("Dinero recaudado: $" + totalRecaudado);
        System.out.println("Paquetes fragiles: " + fragiles);
        System.out.println("Costo mas alto: $" + costoMayor);
    }
}