import java.util.Scanner;

public class NivelPostulante {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        System.out.print("ingrese la cantidad total de preguntas: ");
        int total = miobj.nextInt();

        System.out.print("ingrese la cantidad de respuestas correctas: ");
        int correctas = miobj.nextInt();

        if (total > 0 && correctas >= 0 && correctas <= total) {
            double porcentaje = (correctas * 100.0) / total;

            if (porcentaje >= 90) {
                System.out.println("nivel máximo");
            } else if (porcentaje >= 75) {
                System.out.println("nivel medio");
            } else if (porcentaje >= 50) {
                System.out.println("nivel regular");
            } else {
                System.out.println("fuera de nivel");
            }
        } else {
            System.out.println("datos inválidos");
        }

        miobj.close();
    }
}
