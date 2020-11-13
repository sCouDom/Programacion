
package boletin7;

import javax.swing.JOptionPane;

public class Ej5 {
    public void main(String args[]){
        int i = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        int i2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        int i3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        if(i>i2 && i>i3){
            System.out.println("El número mayor es "+i);
        } else if (i2>i && i2>i3){
            System.out.println("El número mayor es "+i2);
        } else {
            System.out.println("El número mayor es "+i3);
        }
    }
}
