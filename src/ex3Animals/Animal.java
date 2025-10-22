package ex3Animals;

public class Animal {
    private String nome;
    private String raca;
    private int idade;

    //getters
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //metodos

    public void emitirSom(){
        System.out.println("som default");
    }







}
