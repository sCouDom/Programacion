
package boletin4;

public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    public Libro(){
    }
    
    public Libro (String autorC, String tituloC, int anoC, short numPaginasC){
        titulo=tituloC;
        autor=autorC;
        ano=anoC;
        numPaginas=numPaginasC;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAno(){
        return ano;
    }
    public short getNumPaginas(){
        return numPaginas;
    }
    public float getValoracion(){
        return valoracion;
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public void setNumPaginas(short numPaginas){
        this.numPaginas=numPaginas;
    }
    public void setValoracion(float valoracion){
        this.valoracion=valoracion;
    }
    
    public void amosar(){
        System.out.println("Titulo: "+titulo+"\nAutor: "+autor+"\nAño: "+ano+ 
                "\nNúmero de páginas: "+numPaginas+"\nValoracion: "+valoracion);
    }
}