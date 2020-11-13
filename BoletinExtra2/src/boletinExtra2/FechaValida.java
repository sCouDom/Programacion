package boletinExtra2;

import javax.swing.*;

public class FechaValida {

    private static boolean esBisiesto(int ano){
        if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
            return true;
        } else {
            return false;
        }
    }
    public static boolean esFechaValida(int mes, int dia, int ano){
        if(mes>12 || mes<1 || dia<1 || ano<1600 || ano>3000){
            return false;
        }
        switch (mes){
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                if(dia>31) return false;
                break;
            case 4: case 6:
            case 9: case 11:
                if(dia>30) return false;
                break;
            case 2:
                if((!esBisiesto(ano) && dia>28)||(esBisiesto(ano) && dia>29)){
                    return false;
                }
                break;
            default:
                System.out.println("hola, estás en la rama default");
        }
        return true;
    }

    public static void main(String[] args) {
        FechaValida.esFechaValida(Integer.parseInt(JOptionPane.showInputDialog("introduce el mes")),
                                  Integer.parseInt(JOptionPane.showInputDialog("introduce el día")),
                                  Integer.parseInt(JOptionPane.showInputDialog("introduce el año")));
    }
}
