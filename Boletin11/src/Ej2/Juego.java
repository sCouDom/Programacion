package Ej1;

import javax.swing.*;
import java.util.Scanner;

public class Juego {
    public static int pedirNum(String string){
        int k=Integer.parseInt(JOptionPane.showInputDialog(string));
        while(k<=0 || k>50){
            JOptionPane.showMessageDialog(null,"Error: el número debe ser mayor o igual que 1 y menor o igual que 50");
            k=Integer.parseInt(JOptionPane.showInputDialog(string));
        }
        return k;
    }
    public static void adivinar(int nInt, int numA){
        for(int i=0; i<nInt;i++){
            if(Integer.parseInt(JOptionPane.showInputDialog("Adivinar número"))==numA){
                JOptionPane.showMessageDialog(null,"Número adivinado!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Intentar de nuevo");
            }
            JOptionPane.showMessageDialog(null,"No acertaste el número, mala suerte");
        }
    }
}
