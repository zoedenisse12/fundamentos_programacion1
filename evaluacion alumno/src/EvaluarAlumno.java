import java.util.Scanner;

public class EvaluarAlumno {
    public static void main(String[] args) {
        Scanner evaluacion = new Scanner(System.in);

        double promedio, asistencia;

        System.out.print("Ingresa el promedio del alumno: ");
        promedio = evaluacion.nextDouble();

        System.out.print("Ingresa el porcentaje de asistencia: ");
        asistencia = evaluacion.nextDouble();

        if (promedio < 7.0) {
            System.out.println("Reprobado por calificación");
        } else {
            if (asistencia < 80) {
                System.out.println("Reprobado por faltas");
            } else {
                System.out.println("Aprobado regular");
            }
        }

        evaluacion.close();
    }
}