package JavaAula12;

public class Anfibio extends Animal {
    private String Classificacao;

    public Anfibio(String nome, int idade, String genero, String classificacao) {
        super(nome, idade, genero);
        Classificacao = classificacao;
    }

    public String getClassificacao() {
        return Classificacao;
    }

    public void setClassificacao(String classificacao) {
        Classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "Anfibio "+super.toString()+"Classificacao=" + Classificacao + "]";
    }

    
}
