package arreglo;

import java.util.Arrays;

public class Arreglo {
    public static void main(String[] args) {

        int[] arregloEntero = new int[] {5,2,3,4,1};

        System.out.println("Lista sin Ordenar");
        for(int i=0; i<arregloEntero.length; i++){

            System.out.println("["+i+"]: "+arregloEntero[i]);
        }

        //Binary searching
        System.out.println();
        System.out.println("Position value 1: " + Arrays.binarySearch(arregloEntero, 1));

        //sort
        Arrays.sort(arregloEntero);
        System.out.println();
        System.out.println("Lista Ordenada:");
        for(int j=0; j<arregloEntero.length; j++)
        {
            System.out.println("["+j+"]: "+arregloEntero[j]);
        }

        //serching
        System.out.println();
        System.out.println("Position value 1: " + Arrays.binarySearch(arregloEntero, 1));


        String[] arregloCadena = new String[] {"10", "9", "100"};
        System.out.println();
        System.out.println("Valores de Cadena Original");
        for(int i=0; i<arregloCadena.length; i++){
            System.out.println("["+i+"]: " + arregloCadena[i]);
        }

        Arrays.sort(arregloCadena);
        System.out.println();
        System.out.println("Valores de Cadena Ordenada");
        for(int i=0; i<arregloCadena.length; i++){
            System.out.println("["+i+"]: " + arregloCadena[i]);
        }

    }
}
