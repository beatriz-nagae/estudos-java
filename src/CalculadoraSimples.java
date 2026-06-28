public class CalculadoraSimples {

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("Soma: " + soma(10, 5));
        System.out.println("Multiplicação: " + multiplicacao(10, 5));
    }
}
