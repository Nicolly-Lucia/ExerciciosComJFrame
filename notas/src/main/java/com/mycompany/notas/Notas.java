package com.mycompany.notas;

import javax.swing.*;
import java.awt.event.*;

public class Notas extends JFrame {

    JLabel nt1, nt2, nt3, nt4, res;
    JTextField t1, t2, t3, t4;
    JButton btn;

    Notas() {
        setTitle("Calculadora de Notas");
        setLayout(null);
        setResizable(false);

        nt1 = new JLabel("Nota 1:");
        nt1.setBounds(20, 20, 100, 20);
        add(nt1);

        t1 = new JTextField();
        t1.setBounds(120, 20, 100, 20);
        add(t1);

        nt2 = new JLabel("Nota 2:");
        nt2.setBounds(20, 50, 100, 20);
        add(nt2);

        t2 = new JTextField();
        t2.setBounds(120, 50, 100, 20);
        add(t2);

        nt3 = new JLabel("Nota 3:");
        nt3.setBounds(20, 80, 100, 20);
        add(nt3);

        t3 = new JTextField();
        t3.setBounds(120, 80, 100, 20);
        add(t3);

        nt4 = new JLabel("Nota 4:");
        nt4.setBounds(20, 110, 100, 20);
        add(nt4);

        t4 = new JTextField();
        t4.setBounds(120, 110, 100, 20);
        add(t4);

        btn = new JButton("Calcular");
        btn.setBounds(70, 150, 120, 30);
        add(btn);

        res = new JLabel("");
        res.setBounds(70, 200, 200, 20);
        add(res);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(t1.getText());
                double n2 = Double.parseDouble(t2.getText());
                double n3 = Double.parseDouble(t3.getText());
                double n4 = Double.parseDouble(t4.getText());

                double media = (n1 + n2 + n3 + n4) / 4;

                res.setText("Média = " + media);
            }
        });

        setSize(350, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Notas();
    }
}