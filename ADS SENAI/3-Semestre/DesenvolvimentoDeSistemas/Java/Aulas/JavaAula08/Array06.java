import java.util.ArrayList;

public class Array06 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Anderson");
        nomes.add("Bob");
        nomes.add("Carol");

        System.out.println("Nomes no ArrayList " + nomes);
        System.out.println("Nome de index[0] no ArrayList" + nomes.get(0));

        //Imprimindo todos os nomes do Arraylist com for
        for (String nome : nomes) {
            System.out.println(nome);
        }
        //Removendo um elemento especifico da lista
        nomes.remove("Bob");
        System.out.println("Após a remoção, a lista é "+nomes);
    }
}
