
package boletin3_2;

import java.util.Scanner;

public class Boletin3_2 {

    public static void main(String[] args) {
        float celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea los grados Celsius");
        celsius=sc.nextFloat();
        System.out.println("Grados Kelvin: "+(celsius+273f)+"\nGrados Fahrenheit: "+(celsius+32)*5/9);
    }
    
}
