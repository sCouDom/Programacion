

import javax.swing.*;


public class Ej2 {


    private static int contarSus(Integer[] n, int tam){
        int sus=0;
        for (int i = 0; i < tam; i++) {
            if(n[i]<5)
                sus++;
        }
        return sus;
    }

    private static int maxNota(Integer[] n, int tam){
        int max=0;
        for (int i = 0; i < tam; i++) {
            if(n[i]>max)
                max++;
        }
        return max;
    }

    private static float media(Integer[] n, int tam){
        float sum=0;
        for (int i = 0; i < tam; i++)
            sum+=n[i];
        return sum/tam;
    }

    public static void main(String[] args) {
        final int MAX_ALUMNOS=30;
        Integer[] notas = new Integer[MAX_ALUMNOS];

        for (int i = 0; i < MAX_ALUMNOS; i++)
            notas[i]=Integer.parseInt(JOptionPane.showInputDialog("Introducir nota"));

        System.out.println("Aprobados: "+(MAX_ALUMNOS-contarSus(notas, MAX_ALUMNOS) +"\nSuspensos: "
                +contarSus(notas,MAX_ALUMNOS)+"\nMedia: "+media(notas,MAX_ALUMNOS)+
                "\nNota máxima: "+ maxNota(notas,MAX_ALUMNOS)));
    }
}
