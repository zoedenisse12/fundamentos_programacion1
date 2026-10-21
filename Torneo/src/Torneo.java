import java.util.Scanner;
public class Torneo{
    public static void main(String[] args) {
        Scanner torneo = new Scanner(System.in);


        int puntos, total = 0;
        int mas1000 = 0, menos1000 = 0;
        double promedio;


        for (int i = 1; i <= 7; i++) {
            System.out.print("\nPuntuacion de la partida " + i + ": ");
            puntos = torneo.nextInt();


            total = total + puntos;


            if (puntos > 1000) {
                mas1000++;
            } else {
                menos1000++;
            }
        }


        promedio = total / 7.0;


        System.out.println("Puntos acumulados: " + total);
        System.out.println("Promedio de puntuacion: " + promedio);
        System.out.println("Partidas con mas de 1000 puntos: " + mas1000);
        System.out.println("Partidas con 1000 puntos o menos: " + menos1000);
    }
}