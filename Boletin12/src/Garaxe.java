public class Garaxe {
    private static int numCoches;
    private static float prezoPrimeirasHoras=1.5f,prezoNormal=0.2f;
    private static Coche coche;
    private static final int PLAZAS = 5;

    public static void entradaCoche(){
        if(numCoches==5){
            System.out.println("COMPLETO");
        } else {
            System.out.println("PLAZAS DISPOÑIBLES "+(PLAZAS-numCoches));
        }
        numCoches++;
    }

    public static void salidaCoche(float tempo, float cartosRecibidos, Coche coche){
        numCoches--;
        float prezo;
        if (tempo<=3){
            prezo=tempo*prezoPrimeirasHoras;
        }else{
            prezo=3*prezoPrimeirasHoras+(tempo-3)*prezoNormal;
        }
        System.out.println("FACTURA\nMATRÍCULA COCHE:"+coche.matricula+"\nTEMPO:"+tempo+"\nPRECIO:"+prezo+"\nCARTOS RECIBIDOS:" +
                cartosRecibidos+"\nCARTOS DEVOLTOS:"+(cartosRecibidos-prezo)+"\nGRAZAS POR USAR O NOSO APARCADOIRO");
    }

    public static void main(String[] args) {
        Coche coche1 = new Coche("1234A");
        entradaCoche();
        salidaCoche(4, 50, coche1);
        entradaCoche();
        salidaCoche(2, 50, coche1);
        entradaCoche();
        entradaCoche();
        entradaCoche();
        entradaCoche();
        entradaCoche();
        entradaCoche();
        salidaCoche(2, 50, coche1);
    }
}
