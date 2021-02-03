
import javax.swing.*;

public class Ej3 {


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

    private static int buscarAlumno(String[] n, String nombre, int tam){
        for (int i = 0; i < tam; i++) {
            if(n[i].equalsIgnoreCase(nombre))
                return i;
        }
        return -1;
    }

    private static void mostrarNotaAlumno(Integer[] not, String[] nom, int tam){
        String nombre=JOptionPane.showInputDialog("Introducir nombre alumno");
        int pos = buscarAlumno(nom,nombre,tam);
        System.out.println("La nota del alumno "+nom[pos]+" es: "+not[pos]);
    }

    private static void listaAprobados(Integer[] not, String[] nom, int tam){
        Integer[] aprobados = new Integer[tam];
        for (int i = 0; i < tam; i++) {
            if(not[i]>=5)
                aprobados[i]=not[i];
        }
        for (int i = 0; i < tam; i++) {
            if(aprobados[i]!=null)
                System.out.println(nom[i] + " está aprobadx");
        }
    }

    private static void swapInteger(Integer[] o, int a, int b){
        int aux;
        aux=o[b];
        o[b]=o[a];
        o[a]=aux;
    }

    private static void swapString(String[] o, int a, int b){
        String aux;
        aux=o[b];
        o[b]=o[a];
        o[a]=aux;
    }

    public static void ordenarAmbasListas(Integer[] lista, String[] lista2){
        int lenght = lista.length;
        for(int i=0;i<lenght;i++){
            for(int j=0;j<lenght;j++){
                if (lista[i]<lista[j]) {
                    swapInteger(lista, i, j);
                    swapString(lista2, i, j);
                }
            }
        }
    }
    private static String[] ordenarNotas(Integer[] n, String[] nombres, int tam){
        Integer[] notasAux = new Integer[tam];
        for (int i = 0; i < tam; i++)
            notasAux[i]=n[i];
        String[] nombresAux = new String[tam];
        for (int i = 0; i < tam; i++) {
            nombresAux[i]=nombres[i];
        }
        ordenarAmbasListas(notasAux, nombresAux);
        return nombresAux;

    }

    public static void main(String[] args) {
        final int MAX_ALUMNOS=3;
        Integer[] notas = new Integer[MAX_ALUMNOS];
        String[] nombres = new String[MAX_ALUMNOS];

        for (int i = 0; i < MAX_ALUMNOS; i++)
            notas[i]=Integer.parseInt(JOptionPane.showInputDialog("Introducir nota"));

        for (int i = 0; i < MAX_ALUMNOS; i++)
            nombres[i]=JOptionPane.showInputDialog("Introducir nombre");

        System.out.println("Aprobados: "+(MAX_ALUMNOS-contarSus(notas, MAX_ALUMNOS) +"\nSuspensos: "
                +contarSus(notas,MAX_ALUMNOS)+"\nMedia: "+media(notas,MAX_ALUMNOS)+
                "\nNota máxima: "+ maxNota(notas,MAX_ALUMNOS)));

        mostrarNotaAlumno(notas,nombres,MAX_ALUMNOS);
        listaAprobados(notas, nombres, MAX_ALUMNOS);

        System.out.println("Lista de alumnos ordenada por sus notas de forma ascendente");
        for (int i = 0; i < MAX_ALUMNOS; i++) {
            System.out.println(ordenarNotas(notas, nombres, MAX_ALUMNOS)[i]);
        }

    }
}
