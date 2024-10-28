package JavaAula12;

public class Animal {
    private String nome;
    private int idade;
    private String genero;
    
    public Animal(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    // Métodos getters e setters para encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero: " + genero);
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + ", genero=" + genero ;
    }
 
    
}
