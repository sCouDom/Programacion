import javax.swing.*;

public class Ej2 {
    public static void main(String[] args) {
        final int NUM_ALTURAS = Integer.parseInt(JOptionPane.showInputDialog("Introducir número alturas"));
        float alturas[] = new float[NUM_ALTURAS];
        for (int i = 0; i < NUM_ALTURAS; i++) {
            alturas[i]= Float.parseFloat(JOptionPane.showInputDialog("Introduce altura " + i));
        }
        float media, acc=0;
        int supM=0, infM=0;

        for (int i = 0; i < NUM_ALTURAS; i++) {
            acc+=alturas[i];
        }
        media=acc/NUM_ALTURAS;
        System.out.println("La media de alturas es de: " + media);

        for (int i = 0; i < NUM_ALTURAS; i++) {
            float temp = alturas[i];
            if (temp>media)
                    supM++;
            if (temp<media)
                infM++;
        }

        System.out.println("Hay " + supM + " alturas superiores a la media\nHay " + infM + " alturas inferiores a la media");
    }
}
