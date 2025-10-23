package ex4ConversorMoeda;

public class ConversorMoeda implements ConversaoFinanceira {

    private Double valorEmDolar;
    private Double valorEmReais;

    public Double getValorEmDolar() {
        return valorEmDolar;
    }

    public void setValorEmDolar(Double valorEmDolar) {
        this.valorEmDolar = valorEmDolar;
    }

    public Double getValorEmReais() {
        return valorEmReais;
    }

    public void setValorEmReais(Double valorEmReais) {
        this.valorEmReais = valorEmReais;
    }

    @Override
    public double converterDolarParaReal() {
        return valorEmDolar * 5.39;
    }



}
