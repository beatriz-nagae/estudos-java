package ex4ConversorMoeda;

public class Principal {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.setValorEmDolar(10.0);
        System.out.println(conversor.converterDolarParaReal());

        //NOTA: não usou set porque não alteramos o atributo,
        //chamamos um metodo publico (converterDolarParaReal)
        //que internamente usa o atributo e retorna o resultado.
double valorEmReais = conversor.converterDolarParaReal();
        System.out.println(valorEmReais);

    }
}
