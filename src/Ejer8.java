
import java.util.Scanner;

public class Ejer8 {

    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);
        
        System.out.print("ingrese la cantidad total de preguntas: ");
        int totalPreguntas = miobj.nextInt();
        
        System.out.print("ingrese la cantidad de respuestas correctas: ");
        int respuestasCorrectas = miobj.nextInt();
        
        double porcentaje = ((double) respuestasCorrectas / totalPreguntas) * 100;
        
        System.out.print("nivel del postulante: ");
        if (porcentaje >= 90) {
            System.out.println("nivel máximo");
        } else if (porcentaje >= 75) {
            System.out.println("nivel medio");
        } else if (porcentaje >= 50) {
            System.out.println("nivel regular");
        } else {
            System.out.println("fuera de nivel");
        }
        
        miobj.close();
    }
}