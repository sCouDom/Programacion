
package boletin5;

public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    
    public Consumo(){
    }
    public Consumo(float km, float litros, float vMed, float pGas){
        this.km=km;
        this.litros=litros;
        this.vMed=vMed;
        this.pGas=pGas;
    }
    
    public float getTempo(){
        
        return (km/vMed);
    }
    public float consumoMedio(){
        return (litros/km*100);
    }
    public float consumoEuros(){
        return (litros/km*100*pGas);
    }
    
    public void setKms(float km){
        this.km=km;
    }
    public void setLitros(float litros){
        this.litros=litros;
    }
    public void setvMed(float vMed){
        this.vMed=vMed;
    }
    public void setpGas(float pGas){
        this.pGas=pGas;
    }
    public float getKm(){
        return km;
    }
    public float getLitros(){
        return litros;
    }
    public float getvMed(){
        return vMed;
    }
    public float getpGas(){
        return pGas;
    }
}
