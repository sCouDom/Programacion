package sergio_counago;

import javax.swing.*;
import java.awt.*;

public class Interfaz {

    static JFrame frame = new JFrame("Ventanuco");
    static JPanel panel = new JPanel();
    static JLabel nome = new JLabel();
    static JLabel apelido = new JLabel();
    static JLabel empty = new JLabel();
    static JTextField tf1 = new JTextField();
    static JTextField tf2 = new JTextField();
    static JButton premer = new JButton();
    static JButton limpar = new JButton();
    static JTextArea ta = new JTextArea();

    private static void inicializarFrame(){
        frame.setSize(800,600);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static void inicializarPanel(){
        panel.setBounds(0, 0, 800, 600);
        panel.setBackground(Color.gray);
        panel.setLayout(new GridLayout(4,2));
        panel.add(nome);
        panel.add(tf1);
        panel.add(apelido);
        panel.add(tf2);
        panel.add(ta);
        panel.add(empty);
        panel.add(premer);
        panel.add(limpar);
    }

    private static void inicializarComponentes(){
        nome.setText("Nome: ");
        apelido.setText("Apelido: ");
        empty.setText("");
        premer.setText("Premer");
        limpar.setText("Limpar");
        ta.setText("Área de texto.");
    }

    public static void main(String[] args) {
        inicializarComponentes();
        inicializarPanel();
        inicializarFrame();
    }
}
