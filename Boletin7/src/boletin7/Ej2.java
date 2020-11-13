
package boletin7;

import javax.swing.JOptionPane;

public class Ej2 {
    public static void main(String args[]){
        short s = Short.parseShort(JOptionPane.showInputDialog("introduce short"));
        short s2 = Short.parseShort(JOptionPane.showInputDialog("introduce short"));
        short r;
        if(s>=s2){
            System.out.println((s-s2));
        } else {
            System.out.println((s+s2));
        }
    }
}
