import javax.swing.*;

public class ConversorTemperaturas {

    private static float MIN_TEMP = 80;
    private static float CONV_FAHREN = 9/5f, CONV_REAUMUR = 4/5f;

    public static void centigradosAFahrenheit(float tempC) throws TemperaturaErradaExcepcion{
        if (tempC<MIN_TEMP)
            throw new TemperaturaErradaExcepcion("Temperatura dada menor a 80");
        System.out.println(CONV_FAHREN);
        System.out.println(CONV_REAUMUR);
        JOptionPane.showMessageDialog(null, tempC + " en Celsius son " + (tempC*CONV_FAHREN+32.4f) + " Fahrenheit");
    }

    public static void centigradosAReaumur(float tempC) throws TemperaturaErradaExcepcion{
        if (tempC<MIN_TEMP)
            throw new TemperaturaErradaExcepcion("Temperatura dada menor a 80");
        JOptionPane.showMessageDialog(null, tempC + " en Celsius son " + (CONV_REAUMUR*tempC) + " Reaumur");
    }
}
