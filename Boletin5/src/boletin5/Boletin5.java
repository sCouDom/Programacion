
package boletin5;

import java.util.Scanner;

public class Boletin5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Consumo coche = new Consumo();
        System.out.println("Introduzca, por orden, los litros y el precio de la gasolina:");
        coche.setLitros(sc.nextFloat());
        coche.setpGas(sc.nextFloat());
        System.out.println("Introduzca, por orden: km, litros, velocidad media en km/h y precio de la gasolina en €: ");
        Consumo coche2 = new Consumo(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println("El consumo medio del coche2 es: "+coche2.consumoMedio()+" litros cada 100km");
        System.out.println("Actualice los litros:");
        coche2.setLitros(sc.nextFloat());
        System.out.println("Velocidad media del coche2: "+coche2.getvMed()+" km/h");
    }
}
