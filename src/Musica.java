public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double somaAvaliacoes;
    int totalAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println(titulo + artista + anoDeLancamento);
    }

    void avaliarMusica(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double tiraMediaAvaliacoes() {
        return somaAvaliacoes / totalAvaliacoes;
    }
}