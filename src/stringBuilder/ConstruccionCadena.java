package stringBuilder;

public class ConstruccionCadena {

    public static void main(String[] args) {
        StringBuilder entrada = new StringBuilder();

        System.out.println("StringBuilder Inicial: " + entrada.toString());

        agregarElementos(entrada);

        System.out.println("StringBuilder Final: " + entrada.toString());

        StringBuilder entradaDos = new StringBuilder("Hola");

        //Comparar
        System.out.println("entrada es Equals a entradaDos: " + entrada.equals(entradaDos));
        System.out.print("entrada es == a entradaDos: ");
        System.out.print(entrada == entradaDos);

        //Insertar
        System.out.println();
        StringBuilder insertar = new StringBuilder("esto es un texto");
        insertar.insert(3, 2000);
        System.out.println("StringBuilder after insertar: " + insertar);

        //Reemplazar
        System.out.println();
        StringBuilder reemplazar = new StringBuilder("primera cadena");
        reemplazar.replace(0, 7, "segunda");
        System.out.println("StringBuilder after replace: " + reemplazar);

        //Delete
        System.out.println();
        StringBuilder eliminar = new StringBuilder("Cadena Nueva");
        eliminar.delete(3,6);
        System.out.println("StringBuilder after delete: " + eliminar);

        //Reverse
        System.out.println();
        StringBuilder reversa = new StringBuilder("Hola");
        reversa.reverse();
        System.out.println("StringBuilder: " + reversa);

    }

    private static void agregarElementos(StringBuilder entrada){
        entrada.append("Hola");
    }

}
