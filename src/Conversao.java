import java.util.Scanner;

public class Conversao {
    public static void main (String [] args){
double tempcelsius;
double fahrenheit;


        Scanner termometro = new Scanner(System.in);
        System.out.println("Insira a temperatura em C: ");
        tempcelsius = termometro.nextDouble();
        double temperatura_convertida = (tempcelsius * 1.8) + 32.0; // conversão celcius e fahrenheight farengheig faren rapaz como que escreve
        System.out.println("A temperatura convertida é: " + temperatura_convertida);









    }



}
