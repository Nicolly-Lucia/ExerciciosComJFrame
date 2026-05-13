package com.mycompany.pitagoras;

import javax.swing.*;
import java.awt.event.*;

public class Pitagoras extends JFrame {

    JLabel l1, l2, res;
    JTextField t1, t2;
    JButton btn;

    Pitagoras() {
        setTitle("Teorema de Pitágoras");
        setLayout(null);
        setResizable(false);

        l1 = new JLabel("Cateto A:");
        l1.setBounds(20, 20, 100, 20);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(120, 20, 100, 20);
        add(t1);

        l2 = new JLabel("Cateto B:");
        l2.setBounds(20, 50, 100, 20);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(120, 50, 100, 20);
        add(t2);

        btn = new JButton("Calcular");
        btn.setBounds(60, 90, 120, 30);
        add(btn);

        res = new JLabel("");
        res.setBounds(50, 140, 200, 20);
        add(res);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());

                if (a <= 0 || b <= 0) {
                    res.setText("Os catetos devem ser posiivos.");
                } else {
                    double h = Math.sqrt((a * a) + (b * b));
                    res.setText("Hipotenusa = " + String.format("%.2f", h));
                }
            }
        });

        setSize(300, 250);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pitagoras();
    }
}