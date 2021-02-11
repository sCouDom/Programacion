public class Main {
    private static final int NUM_JORNADAS=36;
    private static final int NUM_EQUIPOS=20;
    static int[][] tabla = new int[NUM_EQUIPOS][NUM_JORNADAS];
    static int[] golesTotales=new int[NUM_EQUIPOS];
    

    public static void inicializarTabla(){
        for (int i = 0; i < NUM_EQUIPOS; i++) {
            for (int j = 0; j < NUM_JORNADAS; j++) {
                tabla[i][j]=(int)(Math.random()*5);
            }
        }
    }

    public static void acumularGoles(){
        int acc=0;
        for (int i = 0; i < NUM_EQUIPOS; i++) {
            for (int j = 0; j < NUM_JORNADAS; j++) {
                acc+=tabla[i][j];
            }
            golesTotales[i]=acc;
            acc=0;
        }
    }

    private static void swap(int i, int j){
        int aux=golesTotales[i];
        golesTotales[i]=golesTotales[j];
        golesTotales[j]=aux;
    }

    private static void swapFilas(int filaA, int filaB){
        int aux;
        for (int l = 0; l < NUM_JORNADAS; l++) {
            aux=tabla[filaA][l];
            tabla[filaA][l]=tabla[filaB][l];
            tabla[filaB][l]=aux;
        }
    }

    public static void ordenarEquipos(){
        for (int i = 0; i < NUM_EQUIPOS; i++) {
            for (int j = i+1; j < NUM_EQUIPOS; j++) {
                if(golesTotales[i]>golesTotales[j]){
                    swap(j, i);
                    swapFilas(i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("*****Inicializando aleatoriamente la tabla*****");
        inicializarTabla();
        acumularGoles();
        ordenarEquipos();
        System.out.println("*****Mostrando tabla*****");
        for (int i = 0; i < NUM_EQUIPOS; i++) {
            for (int j = 0; j < NUM_JORNADAS; j++) {
                System.out.print(tabla[i][j]+" ");
            }
            System.out.print("   " + golesTotales[i]);
            System.out.println();
        }

    }
}
