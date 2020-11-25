package Ej2;

public class Ej2 {
    public static void main(String args[]){
        int accs=0, accm=1;
        for(int i=10;i<90;i++){
            accs+=i;
            accm*=i;
        }
        System.out.println("Numeros sumados: "+accs);
        System.out.println("Numeros multiplicados: "+accm);
    }
}
