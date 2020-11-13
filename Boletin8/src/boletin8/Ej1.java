package boletin8;

import javax.swing.JOptionPane;

public class Ej1 {
    public static void main (String args[]){
        String nombre = JOptionPane.showInputDialog("Introduce nombre del objeto");
        int ventas = Integer.parseInt(JOptionPane.showInputDialog("Introduce num ventas"));
        if (ventas<=100){
            System.out.println("el producto "+nombre+" es de tipo bajo");
        } else if (ventas<=500){
            System.out.println("el producto "+nombre+" es de tipo medio");
        } else if(ventas<=1000){
            System.out.println("el producto "+nombre+" es de tipo alto");
        } else {
            System.out.println("el producto "+nombre+" es de primera necesidad");
        }
    }
}

