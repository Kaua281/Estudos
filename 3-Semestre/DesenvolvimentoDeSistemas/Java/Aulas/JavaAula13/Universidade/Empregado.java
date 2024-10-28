package Universidade;

public class Empregado extends Pessoa {
    protected double salario;

    public Empregado(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}