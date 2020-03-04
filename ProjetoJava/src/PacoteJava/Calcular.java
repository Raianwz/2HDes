package PacoteJava;

import javax.swing.*;

public class Calcular {

    public static void main(String[] args) {
        double num1, num2, resp = 0;
        String aux = " ";

        aux = JOptionPane.showInputDialog(null, "Insira o 1º Número: ");
        num1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Insira o 2º Número: ");
        num2 = Double.parseDouble(aux);

        resp = num1 + num2;
        JOptionPane.showMessageDialog(null, "A soma é " + resp);

    }
}
