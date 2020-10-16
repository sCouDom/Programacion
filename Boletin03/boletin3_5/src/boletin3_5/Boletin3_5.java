
package boletin3_5;

import java.util.Scanner;

public class Boletin3_5 {

    public static void main(String[] args) {
        float sFijo, tComision, km, sBruto;
        int dDesplazamiento;
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea sueldo fijo");
        sFijo=sc.nextFloat();
        System.out.println("Teclea total comisión");
        tComision=sc.nextFloat();
        System.out.println("Teclea KM totales");
        km=sc.nextFloat();
        System.out.println("Teclea dias totales desplazamiento");
        dDesplazamiento=sc.nextInt();
        sBruto= (float) (sFijo+0.05*tComision+2*km+30*dDesplazamiento);
        System.out.println("Sueldo bruto: "+sBruto+"\nSueldo neto: "+(sBruto-sBruto*0.82-236));
    }
    
}
