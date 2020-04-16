package proyecto;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Principal extends JFrame{
    JButton b1 = new JButton("Disponibles");
    JButton b2 = new JButton("Reparacion");
    Principal(){
        super("Ingenieria de software");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(44, 62, 80));
        lamina l = new lamina();
        lamina1 l1 = new lamina1();
        setLayout(null);
        setBounds(0, 0, 720, 500);
        add(l);
        add(l1);
        l.setVisible(false);
        b1.setBounds(220, 10, 105, 32);
        b2.setBounds(370, 10, 105, 32);
        add(b1);
        add(b2);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setVisible(true);
                l.setVisible(false);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setVisible(true);
                l1.setVisible(false);
            }
        });
    }
    
    
public class lamina extends JPanel{
    lamina(){
        setBounds(0, 50, 720, 500);
        setBackground(new Color(133, 193, 233));
        setLayout(null);
    }

    
}

    public class lamina1 extends JPanel{
    lamina1(){
        JLabel titulo = new JLabel("Computadoras Disponibles");
        JLabel modelo = new JLabel("Modelo");
        JLabel id = new JLabel("Id");
        JLabel so = new JLabel("S.O");
        JLabel marca = new JLabel("Marca");
        TextField inModelo = new TextField();
        TextField inId = new TextField();
        TextField inSo = new TextField();
        TextField inMarca = new TextField();
        setBounds(0, 50, 720, 500);
        setBackground(new Color(26, 188, 156));
        setLayout(null);
        titulo.setBounds(0, 0, 300, 32);
        modelo.setBounds(0, 80, 60, 30);
        id.setBounds(0, 130, 60, 30);
        so.setBounds(0, 180, 60, 30);
        marca.setBounds(0, 230, 60, 30);
        inModelo.setBounds(80, 84, 200, 22);
        inId.setBounds(80, 134, 200, 22);
        inSo.setBounds(80, 184, 200, 22);
        inMarca.setBounds(80, 234, 200, 22);
        titulo.setFont(new java.awt.Font("Tahoma", 0, 25));
        modelo.setFont(new java.awt.Font("Tahoma", 0, 17));
        id.setFont(new java.awt.Font("Tahoma", 0, 17));
        so.setFont(new java.awt.Font("Tahoma", 0, 17));
        marca.setFont(new java.awt.Font("Tahoma", 0, 17));
        add(titulo);
        add(modelo);
        add(id);
        add(so);
        add(marca);
        add(inModelo);
        add(inId);
        add(inSo);
        add(inMarca);
    }
}
}

