package sergio_counago;

import javax.swing.*;

public class Interfaz extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JList list1;
    private JList list2;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JPanel panelRaiz;
    private JComboBox comboBox1;
    private JComboBox comboBox2;

    public Interfaz(){
        super("InterfazA");
        setContentPane(panelRaiz);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setVisible(true);
    }
}
