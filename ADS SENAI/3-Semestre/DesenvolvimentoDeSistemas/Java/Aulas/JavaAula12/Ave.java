package JavaAula12;

public class Ave extends Animal {
    private boolean voa;

    public Ave(String nome, int idade, String genero,  boolean voa) {
        super(nome, idade, genero);
        this.voa = voa;
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    @Override
    public String toString() {
        return "Ave: "+super.toString()+", voa=" + voa + "]";
    }

    
    

    
}
