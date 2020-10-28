
package boletin4;

public class Boletin4 {

    public static void main(String[] args) {
        Libro libroDefecto = new Libro();
        Libro libroConstPropio = new Libro("Nicolas Gómez Dávila","Escolios a un texto implícito",1977,(short)1408);
        System.out.println("Libro constructor por defecto: ");
        libroDefecto.amosar();
        System.out.println();
        System.out.println("Libro constructor propio: ");
        libroConstPropio.amosar();
        System.out.println();
        System.out.println("Libro constructor por defecto después de dar valores: ");
        libroDefecto.setTitulo("La conjuración sagrada: Ensayos 1929-1939");
        libroDefecto.setAutor("Georges Bataille");
        libroDefecto.setAno(1929);
        libroDefecto.setNumPaginas((short)272);
        libroDefecto.setValoracion(4.7f);
        libroDefecto.amosar();
        System.out.println();
    }
    
}
