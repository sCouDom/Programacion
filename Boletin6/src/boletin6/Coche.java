
package boletin6;

public class Coche {
    private int velocidade;
    
    public Coche(){
        velocidade=0;
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    public void acelerar(int x){
        velocidade+=x;
    }
    public void frenar(int x){
        velocidade-=x;
    }
    
}
