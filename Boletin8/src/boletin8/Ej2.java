package boletin8;

import javax.swing.JOptionPane;

public class Ej2 {

    public static void main(String args[]){
        String[] valoresPosibles = {"A Cuadrado","A Triángulo", "A Círculo"};
        switch (JOptionPane.showInputDialog(null, "Elige", "Hola", JOptionPane.INFORMATION_MESSAGE,null, valoresPosibles, valoresPosibles[0]).toString()){
            case "A Cuadrado":
                System.out.println((Math.pow(Double.parseDouble(JOptionPane.showInputDialog("Introduce lado")),2)));
                break;
            case "A Triángulo":
                System.out.println(Float.parseFloat(JOptionPane.showInputDialog("Introduce base"))*Float.parseFloat(JOptionPane.showInputDialog("Introduce altura"))/2);
                break;
            case "A Círculo":

                System.out.println(Math.pow(Double.parseDouble(JOptionPane.showInputDialog("Introduce radio")), 2)*Math.PI);
                break;
        }
    }
}