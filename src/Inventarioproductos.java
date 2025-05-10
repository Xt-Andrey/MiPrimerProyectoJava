import java.util.Scanner;

public class Inventarioproductos {

    public static void main(String[] args) {
        Scanner miobj = new Scanner(System.in);

        String[] nombres = new String[100];
        int[] cantidades = new int[100];
        double[] precios = new double[100];
        double[] valorestotales = new double[100];

        int totalproductos = 0;
        
        System.out.println("bienvenido al sistema de inventario de productos");
        System.out.println("ingrese la cantidad de productos en General");
        Byte canGeneral = miobj.nextByte();
       
        for (int i = 0; i < canGeneral; i++) {
            System.out.println("ingrese el nombre del producto " + (i + 1));
            nombres[i] = miobj.next();

            System.out.println("ingrese la cantidad");
            cantidades[i] = miobj.nextInt();

            System.out.println("ingrese el precio por unidad");
            precios[i] = miobj.nextDouble();

            valorestotales[i] = cantidades[i] * precios[i];
            totalproductos++;
        }
        
        String respuesta = "si";
        while (respuesta.equals("si")) {
            System.out.println("desea agregar otro producto si o no");
            respuesta = miobj.next();

            if (respuesta.equals("si")) {
                System.out.println("ingrese el nombre del producto");
                nombres[totalproductos] = miobj.next();

                System.out.println("ingrese la cantidad");
                cantidades[totalproductos] = miobj.nextInt();

                System.out.println("ingrese el precio por unidad");
                precios[totalproductos] = miobj.nextDouble();

                valorestotales[totalproductos] = cantidades[totalproductos] * precios[totalproductos];
                totalproductos++;
            }
        }

        System.out.println("desea actualizar la cantidad de un producto si o no");
        respuesta = miobj.next();

        while (respuesta.equals("si")) {
            System.out.println("escriba el nombre del producto a actualizar");
            String nombrebuscar = miobj.next();
            boolean encontrado = false;

            for (int i = 0; i < totalproductos; i++) {
                if (nombres[i].equals(nombrebuscar)) {
                    System.out.println("escriba la nueva cantidad");
                    cantidades[i] = miobj.nextInt();
                    valorestotales[i] = cantidades[i] * precios[i];
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("producto no encontrado");
            }

            System.out.println("desea actualizar otro producto si o no");
            respuesta = miobj.next();
        }

        double valorinventario = 0;
        System.out.println("reporte final del inventario");
        for (int i = 0; i < totalproductos; i++) {
            System.out.println("producto " + nombres[i] + " cantidad " + cantidades[i] + " precio por unidad " + precios[i] + " valor total " + valorestotales[i]);
            valorinventario = valorinventario + valorestotales[i];
        }

        System.out.println("valor total del inventario " + valorinventario);
    }

    }