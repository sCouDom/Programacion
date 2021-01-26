import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int menu = 79;
        float tempC;
        try{
            do{
                menu=Integer.parseInt(JOptionPane.showInputDialog("Introducir 0 para salir, " +
                        "1 para convertir de Celsius a Fahrenheit, 2 para convertir Celsius a Reaumur"));

                if(menu==1){
                    ConversorTemperaturas.centigradosAFahrenheit(Float.parseFloat(JOptionPane.showInputDialog("" +
                            "Introduce grados Celsius")));
                } else if (menu==2) {
                    ConversorTemperaturas.centigradosAReaumur(Float.parseFloat(JOptionPane.showInputDialog("" +
                            "Introduce grados Celsius")));
                }
            }while(menu!=0);
        }catch(TemperaturaErradaExcepcion eTemp){
            System.out.println("ERROR: " + eTemp.getMessage());
        }
    }
}
