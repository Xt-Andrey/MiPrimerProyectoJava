import java.util.Scanner;
public class App {

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



//Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron y la 
//cantidad de preguntas que contestó correctamente. Se pide confeccionar un programa que ingrese los dos datos por teclado e informe el nivel del mismo 
//según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
//	Nivel máximo:	Porcentaje>=90%.
//	Nivel medio:	Porcentaje>=75% y <90%.
//	Nivel regular:	Porcentaje>=50% y <75%.
//	Fuera de nivel:	Porcentaje<50%.