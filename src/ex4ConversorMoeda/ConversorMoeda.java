package ex4ConversorMoeda;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorMoeda implements ConversaoFinanceira {

    private BigDecimal valorEmDolar;
    private BigDecimal valorEmReais;

    private static final BigDecimal COTACAO_DOLAR = new BigDecimal("5.39");

    public BigDecimal getValorEmDolar() {
        return valorEmDolar;
    }

    public void setValorEmDolar(BigDecimal valorEmDolar) {
        if (valorEmDolar.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O valor em dólar não pode ser negativo.");
        }
        this.valorEmDolar = valorEmDolar;
    }

    public BigDecimal getValorEmReais() {
        return valorEmReais;
    }

    public void setValorEmReais(BigDecimal valorEmReais) {
        if (valorEmReais.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O valor em reais não pode ser negativo.");
        }
        this.valorEmReais = valorEmReais;
    }

    @Override
    public double converterDolarParaReal() {
        if (valorEmDolar == null) {
            throw new IllegalStateException("Informe o valor em dólar antes de converter.");
        }

        valorEmReais = valorEmDolar.multiply(COTACAO_DOLAR)
                                   .setScale(2, RoundingMode.HALF_EVEN);

        return valorEmReais.doubleValue();
    }

  
    public double converterRealParaDolar() {
        if (valorEmReais == null) {
            throw new IllegalStateException("Informe o valor em reais antes de converter.");
        }

        valorEmDolar = valorEmReais.divide(COTACAO_DOLAR, 2, RoundingMode.HALF_EVEN);

        return valorEmDolar.doubleValue();
    }
}
