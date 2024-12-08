public class Mamifero extends Animal {
    private String alimentação;

    public Mamifero(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade,
            String alimentação) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
        this.alimentação = alimentação;
    }

    public String getAlimentação() {
        return alimentação;
    }

    public void setAlimentação(String alimentação) {
        this.alimentação = alimentação;
    }
    
    public String toString() {
        return super.toString() + "\nAlimentação: "+ getAlimentação();
    }
}
