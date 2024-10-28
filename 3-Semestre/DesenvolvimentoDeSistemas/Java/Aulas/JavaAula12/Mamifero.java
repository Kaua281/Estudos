package JavaAula12;

public class Mamifero extends Animal{
    private String raca;

    public Mamifero(String nome, int idade, String genero, String raca) {
        super(nome, idade, genero);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Raça: " + raca);
    }

    @Override
    public String toString() {
        return "Mamifero: "+ super.toString() +", raca=" + raca + "]";
    }
    
}
