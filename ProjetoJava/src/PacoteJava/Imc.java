package PacoteJava;

import javax.swing.JOptionPane;

public class Imc {

    public static void main(String[] args) {
        String aux = " ";
        double peso = 0, altura = 0, imc = 0;

        aux = JOptionPane.showInputDialog(null, "Digite seu peso", "Peso", -1);
        peso = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Digite sua Altura", "Altura", -1);
        altura = Double.parseDouble(aux);
        aux = aux.replace(",",".");

        if (peso > 0.5) {
            if (altura > 0.1) {
                imc = peso / (altura * altura);
                if (imc < 18.5) {
                    aux = "Excesso de Magreza";
                }

                if (imc <= 25) {
                    aux = "Peso Normal";
                }
                if (imc <= 30) {
                    aux = "Excesso de Peso";
                }
                if (imc <= 35) {
                    aux = "Obesidade (Grau I)";
                }
                if (imc <= 40) {
                    aux = "Obesidade (Grau II)";
                }
                if (imc > 40) {
                    aux = "Obesidade (Grau III)";
                }
                JOptionPane.showMessageDialog(null, "O valor do IMC é "+imc+". \n O status do seu IMC é: "+aux, "Calculo do IMC", -1);                
            }
        }

    }
}
