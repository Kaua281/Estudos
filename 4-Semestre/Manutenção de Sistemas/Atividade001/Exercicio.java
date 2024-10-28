package Atividade001;

import java.util.Scanner;


public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do material: ");
        String material = scanner.nextLine();
        System.out.print("Digite o valor do primeiro mês: ");
        int mes1 = scanner.nextInt();
        System.out.print("Digite o valor do segundo mês: ");
        int mes2 = scanner.nextInt();
        System.out.print("Digite o valor do terceiro mês: ");
        int mes3 = scanner.nextInt();
        System.out.print("Digite o tempo de reposição: ");
        int tempoDeReposicao = scanner.nextInt();
        System.out.print("Digite o estoque atual: ");
        int estoqueAtual = scanner.nextInt();

        // Cria um objeto Produto com os dados fornecidos
        Produto produto = new Produto(material, mes1, mes2, mes3, tempoDeReposicao, 50, estoqueAtual);

        String[] headers = {"Material", "Mês 1", "Mês 2", "Mês 3", "Venda Média Diária", "Tempo de Reposição", "Estoque Mínimo", "Estoque Máximo", "Estoque Atual", "Tomada de Decisão"};
        String[][] data = {
            {produto.material, String.valueOf(produto.mes1), String.valueOf(produto.mes2), String.valueOf(produto.mes3), 
             String.valueOf(produto.vendaMediaDiaria), String.valueOf(produto.tempoDeReposicao), 
             String.valueOf(produto.estoqueMinimo), String.valueOf(produto.estoqueMaximo), 
             String.valueOf(produto.estoqueAtual), produto.tomadaDeDecisao}
        };

        for (String header : headers) {
            System.out.printf("%-15s", header);
        }
        System.out.println();

        for (String[] row : data) {
            for (String cell : row) {
                System.out.printf("%-15s", cell);
            }
            System.out.println();
        }

        scanner.close();
    }
}
