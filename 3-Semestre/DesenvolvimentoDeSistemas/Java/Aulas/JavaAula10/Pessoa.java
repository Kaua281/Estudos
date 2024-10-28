package JavaAula10;

//arquivo Aluno.java
public class Pessoa{
	private String nome;
    private int codigo;

    public Pessoa(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", codigo=" + codigo + "]";
    }

    public static void main(String[] args) {
        Pessoa Pessoa1 = new Pessoa("Thiago", 0);
        System.out.println(Pessoa1.toString());
        Pessoa1.setNome("Kauã");
        System.out.println(Pessoa1.toString());
    }
	
    
    
}
