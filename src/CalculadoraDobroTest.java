package ex2;
import java.util.Scanner;

public class CalculadoraDobroTest {
    public static void main(String[] args) {

        CalculadoraDobro primeironumero = new CalculadoraDobro();

        System.out.println("Insira um numero: ");
        Scanner scanner = new Scanner(System.in);
        primeironumero.num1 = scanner.nextInt();
        System.out.println("O dobro dele é: " +  primeironumero.dobraNumero());
    }
}
