/*Cadastro de Ar Condicionado: O usuário pode cadastrar novos ar condicionados, informando o modelo (Splinter ou Portátil), código, marca, BTU e se há defeito no aparelho, especificando o tipo de defeito. */

public abstract class ArCondicionado {
    private String modelo;
    private String codigo;
    private String marca;
    private float BTU;
    private String defeito;

    public ArCondicionado() {
    }

    public ArCondicionado(String modelo, String codigo, String marca, float bTU, String defeito) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.marca = marca;
        BTU = bTU;
        this.defeito = defeito;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getBTU() {
        return BTU;
    }

    public void setBTU(float bTU) {
        BTU = bTU;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public abstract String toString();
    
}