package Ej1;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        float num;
        int pos=0, neg=0, cero=0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<10; i++){
            num=sc.nextFloat();
            if (num == 0) {
                cero+=1;
            } else if (num>0){
                pos+=1;
            } else {
                neg+=1;
            }
        }
        System.out.println("Números positivos: "+pos+ "\n" +
                "Números negativos: " +neg+ "\n" +
                "Ceros: " +cero);
    }
}
