
package boletin6;

public class Satelite{
    private double meridiano;
    private double paralelo;
    private double distanciaTierra;
    
    public Satelite(){
        meridiano=paralelo=distanciaTierra=0;
    }
    public Satelite(double m, double p, double dist){
        meridiano=m;
        paralelo=p;
        distanciaTierra=dist;
    }
    
    public void verPosicion(){
        System.out.println("O satelite atópase no paralelo " + paralelo + " no meridiano " + meridiano + " e a " + distanciaTierra + " km da Terra.");
    }
}