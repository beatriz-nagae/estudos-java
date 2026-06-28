public class MediaNotas {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.2};

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        System.out.println("Média: " + (soma / notas.length));
    }
}
