package com.mycompany.triangulo;

import javax.swing.*;
import java.awt.event.*;

public class Triangulo extends JFrame {

    JLabel l1, l2, l3, res;
    JTextField t1, t2, t3;
    JButton btn;

    Triangulo() {
        setTitle("Tipos de Triângulos");
        setLayout(null);
        setResizable(false);

        l1 = new JLabel("Lado 1:");
        l1.setBounds(30, 20, 100, 20);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(100, 20, 100, 20);
        add(t1);

        l2 = new JLabel("Lado 2:");
        l2.setBounds(30, 50, 100, 20);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(100, 50, 100, 20);
        add(t2);

        l3 = new JLabel("Lado 3:");
        l3.setBounds(30, 80, 100, 20);
        add(l3);

        t3 = new JTextField();
        t3.setBounds(100, 80, 100, 20);
        add(t3);

        btn = new JButton("Verificar");
        btn.setBounds(65, 120, 120, 30);
        add(btn);

        res = new JLabel("");
        res.setBounds(50, 170, 200, 20);
        add(res);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty()) {
                    res.setText("Preencha todos os lados");
                    return;
                }

                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = Integer.parseInt(t3.getText());

                if (a + b > c && a + c > b && b + c > a) {
                    if (a == b && b == c)
                        res.setText("Triângulo Equilátero");
                    else if (a == b || a == c || b == c)
                        res.setText("Triângulo Isósceles");
                    else
                        res.setText("Triângulo Escaleno");
                } else {
                    res.setText("Não forma um triângulo");
                }
            }
        });

        setSize(300, 280);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Triangulo();
    }
}