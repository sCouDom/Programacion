
package boletin7;

import javax.swing.JOptionPane;

public class Ej4 {
    public void main(String args[]){
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Introduce peso 1"));
        float peso2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce peso 2"));
        if (peso<=0){
            System.out.println("error, peso incorrecto");
        } else if (peso>peso2){
            System.out.println("El peso mayor es: "+peso+" y la diferencia es "+(peso-peso2));
        } else {
            System.out.println("El peso mayor es: "+peso2+" y la diferencia es "+(peso2-peso));
        }
    }
}
