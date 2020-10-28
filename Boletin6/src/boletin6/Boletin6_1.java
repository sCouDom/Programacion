
package boletin6;

public class Boletin6_1 {
    public static void main(String[] args){
        Coche coche = new Coche();
        System.out.println(coche.getVelocidade());
        coche.acelerar(50);
        System.out.println(coche.getVelocidade());
        coche.frenar(30);
        System.out.println(coche.getVelocidade());
        coche.frenar(30);
        System.out.println(coche.getVelocidade());
    }
}
