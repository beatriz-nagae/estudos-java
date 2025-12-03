package ex4ConversorMoeda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConversorMoeda conversor = new ConversorMoeda();

        System.out.println("=== CONVERSOR DÓLAR → REAL ===");
        System.out.print("Digite o valor em dólar: ");

        double valorEmDolar = scanner.nextDouble();
        conversor.setValorEmDolar(valorEmDolar);

        double valorEmReais = conversor.converterDolarParaReal();

        System.out.println("Valor convertido em reais: R$ " + valorEmReais);

        scanner.close();
    }
}
