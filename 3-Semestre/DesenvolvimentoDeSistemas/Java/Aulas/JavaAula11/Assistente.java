public class Assistente extends Funcionario {
    private double bonus;

    public Assistente(String nome, int idade, double salario, double bonus) {
        super(nome, idade, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Funcionario Assistente [nome=" + getNome() + ", idade=" + getIdade() + ", salario=" + getSalario() + " bonus="+ bonus+"]";
    }    
    
}
