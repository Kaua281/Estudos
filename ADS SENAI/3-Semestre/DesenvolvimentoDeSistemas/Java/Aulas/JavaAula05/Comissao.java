/*
Construa um algoritmo para pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão será de 5% do total da venda e que você tem os seguintes dados:
id_vendedor
cod_peca
preco_unitario
quantidade
valor 
*/

import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o id do vendedor: ");
        String id_vendedor = scanner.nextLine();
        System.out.print("Digite cod_peca: ");
        String cod_peca = scanner.nextLine();
        System.out.print("Digite o preço unitário da peça: ");
        float preco_unitario = scanner.nextFloat();
        System.out.print("Digite a quantidade vendida: ");
        int quantidade = scanner.nextInt();
        scanner.close();
        double comissao = (preco_unitario * quantidade)*0.05;
        System.out.println("A comissão do vendendor de id: "+ id_vendedor+" pela venda de "+ quantidade+" peças id:"+cod_peca+" foi de R$"+comissao);
    }
}
