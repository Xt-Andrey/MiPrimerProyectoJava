import java.util.Scanner;
public class Ejer2 {

    public static void main(String[] args) {
        Scanner miobj=new Scanner(System.in);
        System.out.println("ingrese la primera nota");
        int nota1=miobj.nextInt();
        System.out.println("ingrese la segunda nota ");
        int nota2=miobj.nextInt();
        System.out.println("ingrese la tercera nota");
        int nota3=miobj.nextInt();
        float resultado=(nota1+nota2+nota3)/3;
         if (resultado>=7) { 
            System.out.println("aprovado");
            
        }else{
            System.out.println("no aprobado");
        }
    }
}