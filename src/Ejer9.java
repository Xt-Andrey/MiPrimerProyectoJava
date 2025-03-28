import java.util.Scanner;
public class Ejer9 {

    public static void main(String[] args) {
        Scanner miobj=new Scanner(System.in);
        System.out.println("ingrese tres notas ");
        int nota1=miobj.nextInt();
        int nota2=miobj.nextInt();
        int nota3=miobj.nextInt();
        float promedio=(nota1+nota2+nota3)/3;
        if (promedio>=7) {
            System.out.println("Promocionado");
            
        } else {
            
        }
    }
}