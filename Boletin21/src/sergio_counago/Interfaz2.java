package sergio_counago;

import javax.swing.*;

public class Interfaz2 extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JTextField textField4;
    private JPanel panelRaiz;
    private JPanel panelB;
    private JPanel panelA;
    private JPanel panelC;
    private JTable table1;
    private JButton nuevoButton;
    private JButton eliminarButton;
    private JButton IMprimirButton;
    private JButton deshacerButton;
    private JButton rehacerButton;


    public Interfaz2(){
        super("InterfazB");
        setContentPane(panelRaiz);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setVisible(true);
    }
}
