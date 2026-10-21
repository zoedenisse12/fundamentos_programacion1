import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        int puntos = 100;
        int opcion;
        do {
            System.out.println("\nMENU DE PUNTOS");
            System.out.println("1.Ganar 20 puntos\n2.Gastar 15 puntos\n3.Consultar puntos\n4.Salir");
            System.out.print("Elige una opcion: ");
            opcion = menu.nextInt();
            switch (opcion) {
                case 1:
                    puntos = puntos + 20;
                    System.out.println("Ganaste 20 puntos.");
                    break;
                case 2:
                    if (puntos >= 15) {
                        puntos = puntos - 15;
                        System.out.println("Gastaste 15 puntos.");
                    } else {
                        System.out.println("No tienes suficientes puntos.");
                    }
                    break;
                case 3:
                    System.out.println("Tienes " + puntos + " puntos.");
                    break;
                case 4:
                    System.out.println("Fin programa");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (opcion != 4);
        System.out.println("Puntos restantes: " + puntos);
    }
}