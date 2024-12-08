package JavaAula10;

public class ClienteCpf extends Cliente {
    private String cpf;


    public ClienteCpf(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+"ClienteCpf [cpf=" + cpf + "]";
    }

    public static void main(String[] args) {
        ClienteCpf clienteCpf1 = new ClienteCpf("Kaua", "Liberdade", "102.3123-05");
        System.out.println(clienteCpf1.getCpf());
        Cliente cliente01 = new Cliente("Thiago", "Ladeira");
        System.out.println(cliente01.getEndereco());
    
    }
    
    
}
