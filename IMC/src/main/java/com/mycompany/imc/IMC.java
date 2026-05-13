package com.mycompany.imc;

import javax.swing.*;
import java.awt.event.*;

public class IMC extends JFrame {

    JLabel lpeso, laltura, res;
    JTextField peso, altura;
    JButton btn;

    IMC() {
        setTitle("Calculadora de IMC");
        setLayout(null);
        setResizable(false);

        lpeso = new JLabel("Peso (kg):");
        lpeso.setBounds(30, 20, 100, 20);
        add(lpeso);

        peso = new JTextField();
        peso.setBounds(120, 20, 100, 20);
        add(peso);

        laltura = new JLabel("Altura (m):");
        laltura.setBounds(30, 50, 100, 20);
        add(laltura);

        altura = new JTextField();
        altura.setBounds(120, 50, 100, 20);
        add(altura);

        btn = new JButton("Calcular IMC");
        btn.setBounds(60, 90, 130, 30);
        add(btn);

        res = new JLabel("");
        res.setBounds(30, 140, 250, 60);
        add(res);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(peso.getText());
                double a = Double.parseDouble(altura.getText());

                double imc = p / (a * a);

                String classificacao;
                if (imc < 18.5)
                    classificacao = "Abaixo do peso";
                else if (imc < 25)
                    classificacao = "Peso ideal";
                else if (imc < 30)
                    classificacao = "Sobrepeso";
                else if (imc < 35)
                    classificacao = "Obesidade Grau I";
                else if (imc < 40)
                    classificacao = "Obesidade Grau II";
                else
                    classificacao = "Obesidade Grau III";

                res.setText(String.format("IMC = %.2f\n%s", imc, classificacao));
            }
        });

        setSize(350, 280);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new IMC();
    }
}