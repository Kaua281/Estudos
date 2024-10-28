package JavaAula12;

public class Repteis extends Animal{
    private String grupo;

    public Repteis(String nome, int idade, String genero, String grupo) {
        super(nome, idade, genero);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Repteis: "+super.toString()+", grupo=" + grupo + "]";
    }

    
}
