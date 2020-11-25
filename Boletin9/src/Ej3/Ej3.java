package Ej3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo();
        Scanner sc = new Scanner(System.in);
        float base, altura;
        do{
            System.out.println("Introduce la base");
            base=sc.nextFloat();
        }while(base<=0);
        do{
            System.out.println("Introduce la altura");
            altura=sc.nextFloat();
        }while(altura<=0);
        System.out.println("El área del rectángulo es "+rec.calcularArea(base,altura));
    }
}

