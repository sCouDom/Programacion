package Ej2;

import javax.swing.*;
import java.awt.*;

public class Juego {
    public static int numIntAleatorio() {
        int r = (int) (Math.random() * 50 + 1);
        JOptionPane.showMessageDialog(null,"El número de intentos que tienes es " + r);
        return r;
    }

    public static int elegirNumA() {
        int k = (int) (Math.random() * 50 + 1);
        JOptionPane.showMessageDialog(null,"El número a adivinar ha sido elegido");
        return k;
    }

    public static void adivinar(int nInt, int numA) {
        boolean flag=false;
        for (int i = 0; i < nInt; i++) {
            int k = Integer.parseInt(JOptionPane.showInputDialog("Adivinar número"));
                if (k == numA) {
                    JOptionPane.showMessageDialog(null, "Número adivinado!");
                    flag=true;
                    break;
                } else if (Math.abs(numA - k) <= 5) {
                    JOptionPane.showMessageDialog(null,"Muy cerca");
                } else if (Math.abs(numA - k) <= 10) {
                    JOptionPane.showMessageDialog(null,"Cerca");
                } else if (Math.abs(numA - k) <= 20) {
                    JOptionPane.showMessageDialog(null,"Lejos");
                } else if (Math.abs(numA - k) > 20) {
                    JOptionPane.showMessageDialog(null,"Muy lejos");
                }
        }
        if (!flag){
            JOptionPane.showMessageDialog(null,"Jugaste como nunca pero perdiste como siempre, mala suerte");
        }
    }
}