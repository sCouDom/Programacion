package Ej5;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        int numTrabajadores=0, numSalAcotados=0, numSalMenos1000=0;
        float salario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce salario, 0 para salir");
        while((salario=sc.nextFloat())!=0){
            if(salario<0){
                System.out.println("Error: Salario negativo. Vuelva a introducirlo. 0 para salir.");
            } else {
                if(salario<1000){
                    numSalMenos1000++;
                }else if(salario>=1000 && salario <=1750){
                    numSalAcotados++;
                }
                numTrabajadores++;
            }
        }
        System.out.println("El número de trabajadores que cobran entre 1000€ y 1750€ es "+numSalAcotados);
        System.out.println("El % de trabajadores que cobran menos de 100 es de "+(numSalMenos1000/numTrabajadores*100));
    }
}
