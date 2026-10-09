import java.util.Scanner;

public class ClasificadorClima {
    public static void main(String[] args) {
        Scanner clima = new Scanner(System.in);

        int temperatura;

        System.out.print("Ingresa la temperatura en °C: ");
        temperatura = clima.nextInt();

        if (temperatura < 10) {
            System.out.println("Frío extremo");
        } else if (temperatura <= 20) {
            System.out.println("Clima fresco");
        } else if (temperatura <= 30) {
            System.out.println("Clima agradable");
        } else {
            System.out.println("Calor extremo");
        }

        clima.close();
    }
}