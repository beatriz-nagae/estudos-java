import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0; //inicializar a variavel antes de dar valor pra ela
        double media = 0;//so inicializar zerada

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a sua avaliacao para a Peca?");
            nota = leitura.nextDouble();
            media += nota; //recebe o que ele ja tinha, + nota
        }
        System.out.println("Media de avaliacoes: " + media/3);
    }
}
