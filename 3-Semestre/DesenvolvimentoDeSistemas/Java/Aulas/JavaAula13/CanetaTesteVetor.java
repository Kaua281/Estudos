import java.util.Scanner;

public class CanetaTesteVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Caneta[] ListaCanetas = new Caneta[50];
        int quantidadeCanetas = 0;

        while (true) {
            System.out.print("Menu: \n1 - Cadastrar caneta\n2 - Exibir todas as canetas\n3 - Exibir quantidade de canetas\n4 - Exibir a quantidade de canetas de uma determinada cor\n0 - Sair\nEscolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (quantidadeCanetas < 50) {
                        System.out.print("Digite a marca da caneta: ");
                        String marca = scanner.next();
                        System.out.print("Digite a cor da caneta: ");
                        String cor = scanner.next();
                        System.out.print("Digite o tamanho da caneta: ");
                        String tamanho = scanner.next();

                        ListaCanetas[quantidadeCanetas] = new Caneta(marca, cor, tamanho);
                        quantidadeCanetas++;
                        System.out.println("Caneta cadastrada com sucesso!");
                    } else {
                        System.out.println("Limite de canetas atingido!");
                    }
                    break;
                case 2:
                    System.out.println("Lista de Canetas:");
                    for (int i = 0; i < quantidadeCanetas; i++) {
                        System.out.println((i + 1) + " - " + ListaCanetas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Quantidade de canetas cadastradas: " + quantidadeCanetas);
                    break;
                case 4:
                    System.out.print("Digite a cor da caneta que deseja consultar: ");
                    String corConsulta = scanner.next();
                    int quantidadeCor = 0;
                    for (int i = 0; i < quantidadeCanetas; i++) {
                        if (ListaCanetas[i].getCor().equalsIgnoreCase(corConsulta)) {
                            quantidadeCor++;
                        }
                    }
                    System.out.println("Quantidade de canetas da cor " + corConsulta + ": " + quantidadeCor);
                    break;
                case 0:
                    scanner.close(); 
                    System.out.println("Saindo...");
                    return; 
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
