
package boletin6;

public class Boletin6_3 {
    public static void main(String[] arags){
        Circulo circ = new Circulo();
        Circulo circ2= new Circulo(2.3);
        System.out.println("Probando constructor por defecto");
        System.out.println(circ.getRadio());
        circ.setRadio(5.3);
        System.out.println(circ.getRadio());
        System.out.println(circ.calcularArea());
        System.out.println(circ.calcularLonxitude());
        System.out.println("Probando constructor con parámetros");
        System.out.println(circ2.calcularArea());
        System.out.println(circ2.calcularLonxitude());
        circ.setRadio(10.0);
        System.out.println(circ2.calcularArea());
        System.out.println(circ2.calcularLonxitude());
    }
}
