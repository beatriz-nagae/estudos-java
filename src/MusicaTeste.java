public class MusicaTeste {
    public static void main(String[] args) {
        Musica musica1 = new Musica();

        musica1.titulo = "Juntos e Shallow Now";
        musica1.artista = "Lady Gaga";
        musica1.anoDeLancamento = 2020;

        musica1.avaliarMusica(7);
        musica1.avaliarMusica(3);
        musica1.avaliarMusica(10);

        System.out.println(musica1.tiraMediaAvaliacoes());

    }
}
