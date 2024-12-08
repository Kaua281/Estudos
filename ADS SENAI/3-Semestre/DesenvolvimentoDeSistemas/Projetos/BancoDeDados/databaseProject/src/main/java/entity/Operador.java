package entity;

public class Operador extends Funcionario{
    private String funcao;

    public Operador(String matricula, String nome, int idade, String funcao) {
        super(matricula, nome, idade);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
