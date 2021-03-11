public class Correo {
    private String contido;
    private boolean lido;

    public Correo(String m){
        this.contido=m;
        this.lido=false;
    }

    public Correo(){
        this.contido=null;
        this.lido=false;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public boolean isLido() {
        return lido;
    }

    public void setLido(boolean lido) {
        this.lido = lido;
    }
}
