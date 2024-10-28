package entity;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String matricula, String nome, int idade, String departamento) {
        super(matricula, nome, idade);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    }
    