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
        boolean flag=false;
        for(int i=0; i<nInt;i++){
            int k=Integer.parseInt(JOptionPane.showInputDialog("Adivinar número"));
            if(k==numA){
                JOptionPane.showMessageDialog(null,"Número adivinado!");
                flag=true;
                break;
            } else if(k>numA) {
                JOptionPane.showMessageDialog(null, "Te pasaste");
            } else {
                JOptionPane.showMessageDialog(null, "Te quedaste corto");
            }
        }
        if(!flag){
            JOptionPane.showMessageDialog(null,"Jugaste como nunca y perdiste como siempre, mala suerte");
        }
    }
}
