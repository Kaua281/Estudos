public class Splinter extends ArCondicionado {
    private float tamanho;
    private String tipo;

    public Splinter(String modelo, String codigo, String marca, float bTU, String defeito, String tipo ,float tamanho) {
        super(modelo, codigo, marca, bTU, defeito);
        this.tipo = tipo;
        this.tamanho = tamanho;
    }

    
    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "modelo: " + super.getModelo()+", Código: "+super.getCodigo()+", Marca: "+super.getMarca()+", BTU: "+super.getBTU()+", Defeito: "+super.getDefeito()+", Tipo: "+ tipo+", Tamanho: "+tamanho;
     }
    
    
}
