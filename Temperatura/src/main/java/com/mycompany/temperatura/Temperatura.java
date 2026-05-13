package com.mycompany.temperatura;

import javax.swing.*;
import java.awt.event.*;

public class Temperatura extends JFrame {

    JLabel ltemp, r1, r2;
    JTextField temp;
    JButton btn;

    Temperatura() {
        setTitle("Conversor de Temperatura");
        setLayout(null);
        setResizable(false);

        ltemp = new JLabel("Temperatura em °C:");
        ltemp.setBounds(30, 20, 150, 20);
        add(ltemp);

        temp = new JTextField();
        temp.setBounds(180, 20, 80, 20);
        add(temp);

        btn = new JButton("Converter");
        btn.setBounds(80, 60, 130, 30);
        add(btn);

        r1 = new JLabel("");
        r1.setBounds(30, 110, 250, 20);
        add(r1);

        r2 = new JLabel("");
        r2.setBounds(30, 140, 250, 20);
        add(r2);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double c = Double.parseDouble(temp.getText());

                double f = (c * 9 / 5) + 32;
                double k = c + 273.15;

                r1.setText(String.format("Fahrenheit = %.2f °F", f));
                r2.setText(String.format("Kelvin = %.2f K", k));
            }
        });

        setSize(350, 250);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Temperatura();
    }
}