public class Lampada {
    private String tipo;
    private int voltagem;
    private String cor;
    private String marca;
    private double preco;
    private int potencia;
    private boolean status;

    public Lampada(String tipo, int voltagem, String cor, String marca, double preco, int potencia, boolean status) {
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.potencia = potencia;
        this.status = status;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean getStatus() {
        return status;
    }

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void acender() {
        status = true;
    }

    public void apagar() {
        status = false;
    }

    @Override
    public String toString() {
        String acesa = status ? "acesa" : "apagada";
        return "Tipo: " + tipo + ", Voltagem: " + voltagem + ", Cor: " + cor + ", Marca: " + marca + ", Preço: " + preco
                + ", Potência: " + potencia + ", Status: " + acesa;
    }
}