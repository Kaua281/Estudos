package JavaAula10;

public class Carro {
    private String Marca;
    private String Modelo;
    private String anoDeFabricacao;
    
    public Carro(String marca, String modelo, String anoDeFabricacao) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(String anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }
    @Override
    public String toString() {
        return "Carro [Marca=" + Marca + ", Modelo=" + Modelo + ", anoDeFabricacao=" + anoDeFabricacao + "]";
    }
    

    

}
