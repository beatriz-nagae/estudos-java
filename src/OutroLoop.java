import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0; //inicializar a variavel antes de dar valor pra ela
        double media = 0;//so inicializar zerada
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Avalie a peca ou digite -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) { //se a nota NÂO for -1...
                media += nota; //recebe o que ele ja tinha, + nota
                totalDeNotas++;
            }
        }
        System.out.println("Media de avaliacoes: " + media / totalDeNotas);
    }
}


