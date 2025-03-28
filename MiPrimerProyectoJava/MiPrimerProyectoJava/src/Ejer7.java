import java.util.Scanner;
public class Ejer7 {

    public static void main(String[] args) {
        Scanner miobj=new Scanner(System.in);
        System.out.println("ingrese un numero positivo");
        int mun=miobj.nextInt();
        if (mun>=100 && mun<1000) {
            System.out.println("su numeros de tres cifra");
            
        } else if(mun>=10 && mun<100){
            System.out.println("su numeroes de dos cifras");
        }else if (mun>0 && mun<10){
            System.out.println("su numeroe es de una cifras");

        }else{
            System.out.println("su numero no esta en el rango");
        }
    }
}