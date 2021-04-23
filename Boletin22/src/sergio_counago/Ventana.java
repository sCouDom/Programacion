package sergio_counago;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JButton agregar;
    private JTable table1;
    private JPanel panelRaiz;

    DefaultTableModel model;

    public Ventana(){
        setSize(800,600);
        setContentPane(panelRaiz);

        agregar.addActionListener(this);

        model = new DefaultTableModel();
        model.addColumn("colNombre");
        model.addColumn("colApellido");
        model.addColumn("colCurso");

        model.addRow(new Object[] {
                "<html><div style='font-size: 10px;'><b>Nombre</b></div></html>",
                "<html><div style='font-size: 10px;'><b>Apellido</b></div></html>",
                "<html><div style='font-size: 10px;'><b>Curso</b></div></html>"
        });

        table1.setModel(model);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ventana v = new Ventana();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        model.addRow(new Object[] {textField1.getText(), textField2.getText(), comboBox1.getSelectedItem().toString()});
        textField1.setText("");
        textField2.setText("");
    }
}
