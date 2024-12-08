package JavaAula12;

public class Peixe extends Animal {
    private String CartilaginosoOuOsseo;

    public Peixe(String nome, int idade, String genero, String cartilaginosoOuOsseo) {
        super(nome, idade, genero);
        CartilaginosoOuOsseo = cartilaginosoOuOsseo;
    }

    public String getCartilaginosoOuOsseo() {
        return CartilaginosoOuOsseo;
    }

    public void setCartilaginosoOuOsseo(String cartilaginosoOuOsseo) {
        CartilaginosoOuOsseo = cartilaginosoOuOsseo;
    }

    @Override
    public String toString() {
        return "Peixe: "+super.toString()+", CartilaginosoOuOsseo=" + CartilaginosoOuOsseo + "]";
    }

    

}
