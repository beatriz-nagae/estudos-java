public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2016;
        boolean incluidoNoPlano = false;
        double notaPeca = 8.1;
        String tipoPlano = "Pro";

        if (anoLancamento >= 2024) {
            System.out.println("Lancamentos bombando nos charts!");
        } else {
            System.out.println("Peca fora de cartaz. Vale o Proshot!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("Pro")) {
            System.out.println("Peca Liberado");
        } else {
            System.out.println("Alugue o Proshot");
        }
    }
}
