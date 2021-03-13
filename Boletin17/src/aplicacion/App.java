package aplicacion;

import recursos.Libreria;
import recursos.Libro;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        int op=1;
        Libreria.crearEstante();
        while(op!=0){
            op = Integer.parseInt(JOptionPane.showInputDialog("Introducir 0 para saír," +
                    "1 para engadir libro, 2 para vender libro, 3 para amosar os libros, 4 para dar de baixa libros con 0 uds," +
                    "5 para consultar un libro, 6 para crear un novo estante"));
            switch (op){
                case 1: Libreria.engadirLibro(); break;
                case 2: Libreria.venderLibro(JOptionPane.showInputDialog("Introducir título ou ISBN"));break;
                case 3: Libreria.amosarLibros();break;
                case 4: Libreria.darBaixa();break;
                case 5: Libreria.consultarLibro(JOptionPane.showInputDialog("Introducir título" +
                        "do libro que vai ser consultado"));break;
            }
        }
        System.out.println("Pechando programa");
    }
}
