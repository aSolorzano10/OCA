package lista;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    public static void main(String[] args) {

        List<String> listadenas = new ArrayList<>();
        listadenas.add("Lunes");
        listadenas.add("Martes");
        listadenas.add("Miercoles");
        listadenas.add("Jueves");
        listadenas.add("Viernes");
        listadenas.add("Sabado");
        listadenas.add("Domingo");
        System.out.println("Valores Originales : "+ listadenas.toString());

        //Set -> sustituye el valor el que esta en la posición del indice.
        listadenas.set(0, "No valido");
        System.out.println("Valores después de aplicar Set: " + listadenas.toString());

        //isEmpty
        System.out.println("Empty: " + listadenas.isEmpty());

        //size
        System.out.println("Size: " + listadenas.size());

        //Contains
        System.out.println("Contains Data not valid: " + listadenas.contains("Lunes"));
        System.out.println("Contains Data valid: " + listadenas.contains("Viernes"));

        //Clear
        listadenas.clear();
        System.out.println("Valores después de aplicar clear: " + listadenas.toString());

        //equals
        List<Integer> listaUno = new ArrayList<>();
        List<Integer> listaDos = new ArrayList<>();

        listaUno.add(1);
        listaDos.add(1);
        System.out.println("Equals: " + listaUno.equals(listaDos));
        System.out.println(listaUno == listaDos);
    }
}
