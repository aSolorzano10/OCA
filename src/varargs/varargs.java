package varargs;

import java.util.ArrayList;
import java.util.List;

public class varargs {

    public static void main(String[] args) {

        List<String> prueba = new ArrayList<>();
        String[] arregloCadena = {"z", "x", "c", "v"};

        //Pasando Arreglo
        testiDos(arregloCadena);

        //Argumento de Longitud variable
        testiDos("a", "b", "c");

    }


    public static void testiDos(String ...args){
        System.out.println("test Dos");
        for(int i=0; i< args.length; i++){
            System.out.println("["+i+"]: " + args[i]);
        }
    }
}
