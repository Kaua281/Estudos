public class Peixe extends Animal {
    private String Caracteristicas;

    public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade,
            String caracteristicas) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        Caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        Caracteristicas = caracteristicas;
    }
    
    public String toString() {
        return super.toString()+"\nCaracterísticas: "+ getCaracteristicas();
    }
}

