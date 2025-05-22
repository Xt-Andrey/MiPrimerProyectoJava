import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        int nota, mayores = 0, menores = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("ingrese la nota del alumno " + i + ": ");
            nota = miobj.nextInt();

            if (nota >= 7) {
                mayores++;
            } else {
                menores++;
            }
        }

        System.out.println("cantidad de notas mayores o iguales a 7: " + mayores);
        System.out.println("cantidad de notas menores a 7: " + menores);

        miobj.close();
    }
}
