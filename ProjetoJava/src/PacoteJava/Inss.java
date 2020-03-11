package PacoteJava;

import javax.swing.JOptionPane;

public class Inss {

    public static void main(String[] args) {
        String aux = " ";
        double salario = 0, aliquota = 0, valordesconto = 0, valorliquido = 0;
        
        aux = JOptionPane.showInputDialog(null, "Digite seu salário", "Salário", -1);
        aux = aux.replace(',', '.');
        salario = Double.parseDouble(aux);
        
            if (salario >= 465) {
                if (salario <= 965.67) {
                    aliquota = 0.08;
                    valordesconto = salario * 8 / 100;
                    valorliquido = salario - valordesconto;
                }
                if (salario >= 965.68 && salario <= 1604.95) {
                    aliquota = 0.09;
                    valordesconto = salario * 9 / 100;
                    valorliquido = salario - valordesconto;
                }
                if (salario >= 1604.96 && salario <= 3218.90) {
                    aliquota = 0.11;
                    valordesconto = salario * 11 / 100;
                    valorliquido = salario - valordesconto;
                }
                JOptionPane.showMessageDialog(null, "\n Salário: " + salario + "\n Aliquota: " + aliquota * 100 + " % \n Valor Descontado: " + valordesconto + "\n Valor Líquido: " + valorliquido, "Calculo do INSS", -1);
            } else {
            JOptionPane.showMessageDialog(null, "O Salário informado é inferior a R$ 465,00.", "Salário Inválido", -1);
            System.exit(0);
            }
    }

}
