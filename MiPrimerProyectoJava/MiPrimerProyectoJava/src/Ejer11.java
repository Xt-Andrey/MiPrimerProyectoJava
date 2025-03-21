import java.util.Scanner;
public class Ejer11 {

    public static void main(String[] args) {
        int aprobados=0;
        int reprobados=0;
        Scanner miobj=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese una nueva nota");
            while (true) {
                System.out.println("alumno :"+(i+1));
                double nota = Double.parseDouble(miobj.nextLine());
                if (nota>=0 && nota <=10){
                    if (nota>=7) {
                        aprobados++;
                        
                    } else {
                        reprobados++;
                    }break;
                }
            }
        }
        System.out.println("el numero de aprovados fue "+aprobados);
        System.out.println("el numero de reprobados fue"+reprobados); 
    }
}