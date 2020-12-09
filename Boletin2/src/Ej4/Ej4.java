package Ej4;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introducir el valor de los números");
        float i=sc.nextFloat(), j=sc.nextFloat();
        System.out.println("Suma: "+(i+j)+"\nResta: "+(i-j)+"\nProducto: "+i*j+"\nDivisión: "+i/j);
    }
}
