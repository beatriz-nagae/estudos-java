package ex3Animals;

public class animalTeste {
    public static void main(String[] args) {

        Cachorro cachorrito = new Cachorro();
        cachorrito.setNome("Denis");
        cachorrito.setRaca("Bulldog");
        cachorrito.setIdade(6);
        System.out.println("O nome do seu cachorrito é: " + cachorrito.getNome()); //ó, fiz de teste e é assim mesmo
        cachorrito.abanarORabo();
        cachorrito.emitirSom();

        Gato gatito = new Gato();
        gatito.setNome("Benis");
        gatito.setRaca("Angorá");
        gatito.setIdade(3);
        System.out.println("O nome do gatito é: " + gatito.getNome());
        gatito.arranharMoveis();
        gatito.emitirSom();

    }
}
