package recursos;

import com.sun.xml.internal.ws.util.StringUtils;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.ArrayList;

public class Libreria {
    private static ArrayList<Libro> estante=null;

    public static void crearEstante(){
        estante= new ArrayList<Libro>();
    }

    private static void swapEstante(int a, int b){
        Libro temp=estante.get(a);
        estante.set(a,estante.get(b));
        estante.set(b,temp);
    }

    private static void ordenarTitulo(){
        if(estante.size()>1){
            for (int i = 1; i < estante.size(); i++) {
                if (estante.get(i-1).getTitulo().compareToIgnoreCase(estante.get(i).getTitulo())>0)
                    swapEstante(i,i-1);
            }
        }
    }

    private static Libro crearLibro(){
        return new Libro(JOptionPane.showInputDialog("Introducir autor"), JOptionPane.showInputDialog("Introducir titulo"),
        JOptionPane.showInputDialog("Introducir ISBN"),Integer.parseInt(JOptionPane.showInputDialog("Introducir prezo")),
                Integer.parseInt(JOptionPane.showInputDialog("Introducir unidades")));
    }

    public static void engadirLibro(){
        estante.add(crearLibro());
        ordenarTitulo();
        System.out.println("***Libro añadido***");
    }

    private static int buscarLibro(String str, int o){
        if(o==0){
            for (int i = 0; i < estante.size(); i++) {
                if(str.compareToIgnoreCase(estante.get(i).getTitulo())==0)
                    return i;
            }
        } else {
            for (int i = 0; i < estante.size(); i++) {
                if(str.compareToIgnoreCase(estante.get(i).getISBN())==0)
                    return i;
            }
        }
        return -1;
    }

    public static void venderLibro(String str) throws NullPointerException{
        Libro temp;
        int pos;
        if(estante==null)
            throw new NullPointerException();
        if(str.chars().allMatch(Character::isDigit)){
            pos = buscarLibro(str, 1);
            if(pos!=-1){
                temp = estante.get(pos);
                temp.setUds(temp.getUds()-1);
                estante.set(pos, temp);
                System.out.println("***Libro borrado***");
            }
        }
        else{
            pos = buscarLibro(str, 0);
            if (pos!=-1){
                temp = estante.get(pos);
                temp.setUds(temp.getUds()-1);
                estante.set(pos, temp);
                System.out.println("***Libro borrado***");
            }
        }
    }

    public static void amosarLibros() throws NullPointerException {
        if (estante==null)
            throw new NullPointerException();
        for (int i = 0; i < estante.size(); i++) {
            System.out.println(estante.get(i).toString());
        }
    }

    public static void darBaixa() throws NullPointerException{
        if (estante==null)
            throw new NullPointerException();
        for (int i = 0; i < estante.size(); i++) {
            if(estante.get(i).getUds()==0){
                estante.remove(i);
            }
        }
        System.out.println("***Libros dados de baixa***");
    }

    public static void consultarLibro(String titulo)throws NullPointerException{
        if(estante==null)
            throw new NullPointerException();
        boolean flag=true;
        int i=0;
        while(flag){
            if(estante.get(i).getTitulo().compareToIgnoreCase(titulo)==0){
                System.out.println(estante.get(i).toString());
                flag=false;
            }
            i++;
        }
    }

}
