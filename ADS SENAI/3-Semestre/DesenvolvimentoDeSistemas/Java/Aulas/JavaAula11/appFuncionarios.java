public class appFuncionarios {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("kaua", 19, 3.700, 1.600);
        Assistente assistente1 = new Assistente("Thiago", 19, 2.200, 1.200);
        System.out.println(gerente1.toString());
        System.out.println(assistente1.toString());
    }
    
}
