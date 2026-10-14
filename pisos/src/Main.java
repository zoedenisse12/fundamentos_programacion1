import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner elevador=new Scanner(System.in);

        System.out.println("ingresa el piso en el que te encuentras");
        int pisoac= elevador.nextInt();

        if (pisoac <= 0){
            System.out.println("No se permite ese número");
            return;
        }

        System.out.println("ingresa el piso al que quieras ir");
        int pisoir= elevador.nextInt();

        if (pisoir <= 0){
            System.out.println("No se permite ese número");
            return;
        }

        if (pisoac==pisoir){
            System.out.println("ya estas en ese piso");
        }else if(pisoac<pisoir) {
            while (pisoac < pisoir) {
                pisoac++;
                System.out.println("estas pasando por los pisos" + pisoac);
            }
        }else{

            while (pisoac>pisoir){
                pisoac--;
                System.out.println("estas pasando por los pisos "+pisoac);
            }
        }
    }
}