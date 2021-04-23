package sergio_counago;

import javax.swing.*;
import java.awt.*;

public class Interfaz {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);

        JPanel panelC = new JPanel();

        JPanel panelB = new JPanel();
        panelB.setSize(400,300);

        JPanel panelA = new JPanel();

        JLabel nome = new JLabel();
        nome.setText("Nome: ");

        JLabel apelido = new JLabel();
        apelido.setText("Apelido: ");

        JTextField tf1 = new JTextField();

        JTextField tf2 = new JTextField();

        JButton premer = new JButton();
        premer.setText("premer");

        JButton limpar = new JButton();
        limpar.setText("limpar");

        panelC.setLayout(new BoxLayout(panelC, BoxLayout.Y_AXIS));
        panelC.add(panelA);
        panelC.add(panelB);

        panelA.setBounds(0, 0, 800, 600);
        panelA.setSize(400,300);
        panelA.setBackground(Color.lightGray);
        panelA.setLayout(new GridLayout(3, 2));
        panelA.add(nome);
        panelA.add(tf1);
        panelA.add(apelido);
        panelA.add(tf2);
        panelA.add(premer);
        panelA.add(limpar);

        panelB.setLayout(new FlowLayout());
        panelB.setSize(400,300);

        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista.addElement("Elemento1");
        modeloLista.addElement("Elemento 2");
        modeloLista.addElement("Elemento 3");
        JList lista = new JList<String>(modeloLista);
        JButton boton = new JButton();
        boton.setText("BOTON");
        JTextArea ta = new JTextArea("Area de texto");

        panelB.add(lista);
        panelB.add(boton);
        panelB.add(ta);

        frame.add(panelC);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
