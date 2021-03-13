package recursos;

public class Libro {
    private String autor;
    private String titulo;
    private String ISBN;
    private float prezo;
    private int uds;

    public Libro(String autor, String titulo, String ISBN, float prezo, int uds) {
        this.autor = autor;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.uds = uds;
    }

    public Libro(){

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUds() {
        return uds;
    }

    public void setUds(int uds) {
        this.uds = uds;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", prezo=" + prezo +
                ", uds=" + uds +
                '}';
    }
}
