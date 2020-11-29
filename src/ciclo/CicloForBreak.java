package ciclo;

public class CicloForBreak {

    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            if(i==5){
                break;
            }
            System.out.println("["+i+"]");
        }
        System.out.println("Fuera del Ciclo");
    }
}
