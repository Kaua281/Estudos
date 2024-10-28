public class Portatil extends ArCondicionado {
    private float voltagem;
    private String cor;
    
    public Portatil(String modelo, String codigo, String marca, float bTU, String defeito, float voltagem, String cor) {
        super(modelo, codigo, marca, bTU, defeito);
        this.voltagem = voltagem;
        this.cor = cor;
    }

    public float getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(float voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
       return "modelo: " + super.getModelo()+", Código: "+super.getCodigo()+", Marca: "+super.getMarca()+", BTU: "+super.getBTU()+", Defeito: "+super.getDefeito()+", Voltagem: "+ voltagem+", Cor: "+cor;
    }

    
    
}
