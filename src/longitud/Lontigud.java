package longitud;

import java.util.ArrayList;
import java.util.List;

public class Lontigud {

    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);
        listaEnteros.add(4);
        listaEnteros.add(5);

        int[] arregloEntero = new int[] {1,2,3,4,5,6,7,8,9};

        String cadenaEnteros = "123";

        System.out.println("Longitud ArrayList size(): " + listaEnteros.size());
        System.out.println("Longitud Arreglo length: " + arregloEntero.length);
        System.out.println("Longitud String length(): " + cadenaEnteros.length());

    }
}
