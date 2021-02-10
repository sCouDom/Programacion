import javax.swing.*;

public class Ej1 {


    public static void main(String[] args) {
        int numeros[] = new int[10];
        int parAcc=0, negAcc=0;
        for (int i = 0; i < 10; i++) {
            numeros[i]= Integer.parseInt(JOptionPane.showInputDialog("Introduce número"));
        }
        for (int i = 0; i < 10; i++) {
            if(numeros[i]%2==0)
                parAcc++;
            if(numeros[i]<0)
                negAcc++;
        }
        System.out.println("Hay " + parAcc + " números pares y " + negAcc + " números negativos");
    }
}
