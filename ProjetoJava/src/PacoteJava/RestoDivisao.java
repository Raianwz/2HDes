package PacoteJava;

import javax.swing.*;

public class RestoDivisao {

    public static void main(String[] args) {
        double num1=0, num2=0, resp=0;
        String aux = " ";

        aux = JOptionPane.showInputDialog(null, "Insira o 1º número: ");
        num1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Insira o 2º número: ");
        num2 = Double.parseDouble(aux);

        resp = num1 % num2;
        JOptionPane.showMessageDialog(null, "O Resto é " + resp);
    }
}
