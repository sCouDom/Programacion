package Ej3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir la tarifa de cambio");
        float cambio=sc.nextFloat();
        System.out.println("Introducir la cantidad de euros");
        float euros=sc.nextFloat();
        System.out.println(euros+" euros son "+euros*cambio+" dólares");
    }
}
