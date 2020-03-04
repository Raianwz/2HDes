package PacoteJava;

import javax.swing.JOptionPane;

public class Inss {

    public static void main(String[] args) {
        String aux = " ";
        double salario = 0, aliquota = 0, valordesconto = 0, valorliquido = 0;

        aux = JOptionPane.showInputDialog(null, "Digite seu salário", "Salário", -1);
        aux =  aux.replace(',', '.');
        salario = Double.parseDouble(aux);

        if (salario <= 965.67 && salario <= 1609.45) {
            

        }
    }
}
