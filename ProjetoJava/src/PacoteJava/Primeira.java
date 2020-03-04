package PacoteJava;

public class Primeira {

    public static void main(String[] args) {
        //System.out.println("Olá Mundo!!!");
        Imprimir.imprimirValor("Teste!");
        
        double resp = Imprimir.somaValor(10.5, 10.5);
        System.out.println("A soma = "+resp);
    }
    
}
