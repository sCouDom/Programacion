package boletinExtra2;

import javax.swing.*;

public class Extras2_1 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introducir edad"));
        float cuotaBasica = 800;
        String[] valoresPosibles = {"Sí","No"};
        if(edad>65){
            System.out.println("Cuota de "+(cuotaBasica*0.6));
        } else if (edad<21 && (JOptionPane.showInputDialog(null, "Elige", "Hola", JOptionPane.INFORMATION_MESSAGE,null, valoresPosibles, valoresPosibles[0]).toString()).equalsIgnoreCase("Sí")){
            System.out.println("Cuota de "+(cuotaBasica*0.55));
        } else {
            System.out.println("Cuota de "+(cuotaBasica*0.75));
        }
    }
}
