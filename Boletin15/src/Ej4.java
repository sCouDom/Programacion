import javax.swing.*;

public class Ej4 {
    public static void main(String[] args) {
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Introducir 8 numeros DNI"));
        int restoDni = dni % 23;
        switch (restoDni){
            case 3:
                System.out.println("La letra es A");
                break;
            case 11:
                System.out.println("La letra es B");
                break;
            case 20:
                System.out.println("La letra es C");
                break;
            case 9:
                System.out.println("La letra es D");
                break;
            case 22:
                System.out.println("La letra es E");
                break;
            case 7:
                System.out.println("La letra es F");
                break;
            case 4:
                System.out.println("La letra es G");
                break;
            case 18:
                System.out.println("La letra es H");
                break;
            case 13:
                System.out.println("La letra es J");
                break;
            case 21:
                System.out.println("La letra es K");
                break;
            case 19:
                System.out.println("La letra es L");
                break;
            case 5:
                System.out.println("La letra es M");
                break;
            case 12:
                System.out.println("La letra es N");
                break;
            case 8:
                System.out.println("La letra es P");
                break;
            case 16:
                System.out.println("La letra es Q");
                break;
            case 1:
                System.out.println("La letra es R");
                break;
            case 15:
                System.out.println("La letra es S");
                break;
            case 0:
                System.out.println("La letra es T");
                break;
            case 17:
                System.out.println("La letra es V");
                break;
            case 2:
                System.out.println("La letra es W");
                break;
            case 10:
                System.out.println("La letra es X");
                break;
            case 6:
                System.out.println("La letra es Y");
                break;
            case 14:
                System.out.println("La letra es Z");
                break;
        }
    }
}
