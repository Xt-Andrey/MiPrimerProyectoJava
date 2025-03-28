
import java.util.Scanner;
public class Ejer8 {

    public static void main(String[] args) {
        Scanner miobj= new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD PREGUNTAS");
        int precorrec=miobj.nextInt();
        if (precorrec>0) {
            
        System.out.println("CUANTAS PREGUNTAS CORRECTAS HIZO EL POSTULANTE");
        int pre=miobj.nextInt();
        double porcorrec = ((double) pre/precorrec)*100;
        String nivel;
        if ( pre>0) {

            if (precorrec==pre && precorrec>=90) {
            nivel = "Nivel máximo";
        } else if (precorrec >= 75) {
            nivel = "Nivel medio";
        } else if (precorrec >= 50) {
            nivel = "Nivel regular";
        }else if (precorrec>=0) {
            nivel="nivel bajo";
            
        }else {
            nivel = "sin nivel, no a optenido ninguna correcta   ";
        }System.out.println("el poercentaje de preguntas correctas es"+porcorrec);
        System.out.println("nivel optenido:" +  nivel);
            }else{
                System.out.println("no contesto ninguna correcta");
            }
            
        }
        else{
                System.out.println("la cantidad de preguntas no es procesable");
            }
        }
    }