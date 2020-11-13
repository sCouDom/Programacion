
package boletin7;

import javax.swing.JOptionPane;

public class Ej1 {
    public static void main(String args[]){
        int C = Integer.parseInt(JOptionPane.showInputDialog("Introduce numero"));
        if(0<C){
            System.out.println(C + " es positivo");
        }
    }
}
