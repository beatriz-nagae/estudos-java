//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String nomeDaPeca = "Dear Evan Hansen";
        int anoLancamento = 2016;
        boolean incluidoNoPlano = false;
        double notaPeca = 8.1;
        double media = (8.1 + 7.6 + 3.2) /3;
        int classificacao;
        classificacao = (int) (media/2); //transforma em int, por que media era double.
        System.out.println(classificacao);

        String sinopse = nomeDaPeca + """
                Um jovem com ansiedade social se envolve
                em confusão. 
                Ano de lancamento:
                """ + anoLancamento;

        System.out.printf("Esse é o NotPlayBill!");
        System.out.println("Musical: Dear Evan Hansen");
        System.out.println(sinopse);
    }
}