import java.util.Scanner;

public class  Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el numero de inicio");
        int inicio = input.nextInt();
        System.out.println("ingrese el numero fin");
        int fin = input.nextInt();
       
        if (inicio > fin);{
            System.out.println("entreda no valida");
            input.close();
            return;
        }
        boolean encontrar = false;
      
        
        for (int i=Math.max(2,inicio); i < fin ; i++);{
        int contadorDivisores=0;
        int primeroDivisor=0;
        int segundoDivisor=0;

        for (int j=2; j<= i; j++){

            if (i % j ==0) {
                contadorDivisores ++;
                if (contadorDivisores==1){
                    primeroDivisor ++ ;

                }else if (contadorDivisores ==2){
                    segundoDivisor ++;
                }else {
                    break;
                }
            }
        }
        
    }
}
}