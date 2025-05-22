import java.util.Scanner;

public class EvaluacionAlumno {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        System.out.print("ingrese la primera nota: ");
        double nota1 = miobj.nextDouble();

        System.out.print("ingrese la segunda nota: ");
        double nota2 = miobj.nextDouble();

        System.out.print("ingrese la tercera nota: ");
        double nota3 = miobj.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println("promocionado");
        } else if (promedio >= 4) {
            System.out.println("regular");
        } else {
            System.out.println("reprobado");
        }

        miobj.close();
    }
}
