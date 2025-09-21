import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String perfil;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome");
        perfil = scanner.nextLine();
        System.out.printf("Seja bem vindo, %s!%n", perfil);

    }
}