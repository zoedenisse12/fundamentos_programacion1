import java.util.Scanner;
public class Bateria{
    public static void main(String[] args) {
        Scanner dron = new Scanner(System.in);

        int bateria;
        int minuto = 1;

        System.out.print("Bateria inicial: ");
        bateria = dron.nextInt();

        while (bateria >= 7) {
            bateria = bateria - 7;
            System.out.println("Minuto " + minuto + " -> " + bateria + "%");
            minuto++;
        }

        System.out.println("El dron ya no puede completar otro minuto.");
    }
}