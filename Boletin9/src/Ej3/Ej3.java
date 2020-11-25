package Ej3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<2;i++){
            if (i==0){
                System.out.println("Introduce la base");
                rec.setBase(sc.nextFloat());
            } else {
                System.out.println("Introduce la altura");
                rec.setAltura(sc.nextFloat());
            }
        }
        System.out.println("El área del rectángulo es "+rec.calcularArea());
    }
}
