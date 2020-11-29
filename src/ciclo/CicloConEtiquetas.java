package ciclo;

public class CicloConEtiquetas {

    public static void main(String[] args) {
        externo: for(int i=1; i<10; i++){
            System.out.println("["+i+"]");
            while (i%2==0){
                System.out.println("Dentro de while");
                break externo;
            }
        }
        System.out.println("Fuera del Ciclo");
    }

}
