
package boletin6;

import static java.lang.Math.pow;

public class Circulo {
    private double radio;
    static final double PI =3.14159265358979323846;
    
    public Circulo(){
    }
    public Circulo(double radio){
        this.radio=radio;
    }
    
    public void setRadio(double r){
        radio=r;
    }
    public double getRadio(){
        return radio;
    }
    
    public double calcularArea(){
        return (PI*pow(radio,2));
    }
    public double calcularLonxitude(){
        return (2*PI*radio);
    }
}
