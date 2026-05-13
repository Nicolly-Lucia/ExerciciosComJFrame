package com.mycompany.bhaskara;

import javax.swing.*;
import java.awt.event.*;

public class Bhaskara extends JFrame {

    JLabel la, lb, lc, res;
    JTextField ta, tb, tc;
    JButton btn;

    Bhaskara() {
        setTitle("Fórmula de Bhaskara");
        setLayout(null);
        setResizable(false);

        la = new JLabel("A:");
        la.setBounds(20, 20, 50, 20);
        add(la);

        ta = new JTextField();
        ta.setBounds(60, 20, 100, 20);
        add(ta);

        lb = new JLabel("B:");
        lb.setBounds(20, 50, 50, 20);
        add(lb);

        tb = new JTextField();
        tb.setBounds(60, 50, 100, 20);
        add(tb);

        lc = new JLabel("C:");
        lc.setBounds(20, 80, 50, 20);
        add(lc);

        tc = new JTextField();
        tc.setBounds(60, 80, 100, 20);
        add(tc);

        btn = new JButton("Calcular");
        btn.setBounds(40, 120, 120, 30);
        add(btn);

        res = new JLabel("");
        res.setBounds(20, 170, 250, 50);
        add(res);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(ta.getText());
                double b = Double.parseDouble(tb.getText());
                double c = Double.parseDouble(tc.getText());

                double delta = (b * b) - (4 * a * c);

                if (delta < 0) {
                    res.setText("Delta negativo, não existe raizes");
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    res.setText("X1 = " + x1 + "  |  X2 = " + x2);
                }
            }
        });

        setSize(350, 280);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Bhaskara();
    }
}