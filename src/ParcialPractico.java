import java.util.Scanner;

public class ParcialPractico {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        System.out.print("ingrese la cantidad de estudiantes ");
        int estudiantes = miobj.nextInt();
        miobj.nextLine();

        int esApro = 0;

        for (int i = 0; i < estudiantes; i++) {
            System.out.print("ingrese la primera nota ");
            double nota1 = miobj.nextDouble();
            System.out.print("ingrese la segunda nota ");
            double nota2 = miobj.nextDouble();
            System.out.print("ingrese la tercera nota ");
            double nota3 = miobj.nextDouble();

            if ((nota1 >= 0 && nota1 <= 5) && (nota2 >= 0 && nota2 <= 5) && (nota3 >= 0 && nota3 <= 5)) {
                double promedio = (nota1 + nota2 + nota3) / 3;
                System.out.println("el promedio del estudiante es " + promedio);
                if (promedio >= 3.0) {
                    System.out.println("el estudiante aprobo");
                    esApro++;
                } else {
                    System.out.println("el estudiante reprobo");
                }
            } else {
                System.out.println("ingrese un numero que este en el rango de 0 a 5");
            }
        }

        System.out.println("cantidad de estudiantes aprobados " + esApro);
        miobj.close();
    }
}
