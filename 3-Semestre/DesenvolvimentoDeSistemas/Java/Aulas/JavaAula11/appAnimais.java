public class appAnimais {
    public static void main(String[] args) {
        Mamifero Gato = new Mamifero("Floki", 40.4, 4, "Branco e preto listrado", "doméstico", 48, "Carnívoro");
        System.out.println(Gato.toString());
        Peixe Peixe = new Peixe("Dourado", 40, 0, "Dourada", "Água", 30,
                "É predador e alimenta-se de pequenos peixes. Nadam em grupos. O peixe dourado é conhecido como o rei do rio.");
        System.out.println(Peixe.toString());
    }
}
