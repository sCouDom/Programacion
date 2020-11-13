
package boletin7;

import javax.swing.JOptionPane;

public class Ej3 {
    public void main(String args[]){
        float f = Float.parseFloat(JOptionPane.showInputDialog("Introduce numero"));
        if (f>0){
            System.out.println("+");
        } else if (f<0){
            System.out.println("-");
        } else {
            System.out.println("0");
        }
    }
}
