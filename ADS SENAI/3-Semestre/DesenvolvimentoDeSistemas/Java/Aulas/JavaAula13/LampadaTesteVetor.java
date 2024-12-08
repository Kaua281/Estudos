import java.util.Scanner;

public class LampadaTesteVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lampada[] vetorLampadas = new Lampada[30];
        int quantidadeLampadas = 0;

        while (true) {
            System.out.print("Menu: \n1 - Cadastrar lâmpada\n2 - Exibir todas as lâmpadas\n3 - Exibir quantidade de lâmpadas cadastradas\n4 - Consultar quantidade de lâmpadas de uma determinada potência\n5 - Exibir os dados das lâmpadas com preço menor do que o preço médio das lâmpadas cadastradas\n6 - Exibir a quantidade de lâmpadas acesas e apagadas\n0 - Sair\nEscolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (quantidadeLampadas < 30) {
                        System.out.print("Digite o tipo da lâmpada: ");
                        String tipo = scanner.next();
                        System.out.print("Digite a voltagem da lâmpada: ");
                        int voltagem = scanner.nextInt();
                        System.out.print("Digite a cor da lâmpada: ");
                        String cor = scanner.next();
                        System.out.print("Digite a marca da lâmpada: ");
                        String marca = scanner.next();
                        System.out.print("Digite o preço da lâmpada: ");
                        double preco = scanner.nextDouble();
                        System.out.print("Digite a potência da lâmpada: ");
                        int potencia = scanner.nextInt();
                        System.out.print("Digite se a lampada está acesa ou apagada: ");
                        String status = scanner.next();
                        boolean Bstatus = false;
                        if (status.equals("acesa")){
                            Bstatus = true;
                        }
                        vetorLampadas[quantidadeLampadas] = new Lampada(tipo, voltagem, cor, marca, preco, potencia, Bstatus);
                        quantidadeLampadas++;
                        System.out.println("Lâmpada cadastrada com sucesso!");
                    } else {
                        System.out.println("Limite de lâmpadas atingido!");
                    }
                    break;
                case 2:
                    System.out.println("Lista de Lâmpadas:");
                    for (int i = 0; i < quantidadeLampadas; i++) {
                        System.out.println((i + 1) + " - " + vetorLampadas[i]);
                    }
                    break;
                case 3:
                    System.out.println("Quantidade de lâmpadas cadastradas: " + quantidadeLampadas);
                    break;
                case 4:
                    System.out.print("Digite a potência da lâmpada que deseja consultar: ");
                    int potenciaConsulta = scanner.nextInt();
                    int quantidadePotencia = 0;
                    for (int i = 0; i < quantidadeLampadas; i++) {
                        if (vetorLampadas[i].getPotencia() == potenciaConsulta) {
                            quantidadePotencia++;
                        }
                    }
                    System.out.println("Quantidade de lâmpadas de potência " + potenciaConsulta + ": " + quantidadePotencia);
                    break;
                case 5:
                    double somaPrecos = 0;
                    for (int i = 0; i < quantidadeLampadas; i++) {
                        somaPrecos += vetorLampadas[i].getPreco();
                    }
                    double precoMedio = somaPrecos / quantidadeLampadas;

                    System.out.println("Lâmpadas com preço menor do que o preço médio:");
                    for (int i = 0; i < quantidadeLampadas; i++) {
                        if (vetorLampadas[i].getPreco() < precoMedio) {
                            System.out.println(vetorLampadas[i]);
                        }
                    }
                    break;
                case 6:
                    int quantidadeAcesas = 0;
                    int quantidadeApagadas = 0;
                    for (int i = 0; i < quantidadeLampadas; i++) {
                        if (vetorLampadas[i].getStatus()) {
                            quantidadeAcesas++;
                        } else {
                            quantidadeApagadas++;
                        }
                    }
                    System.out.println("Quantidade de lâmpadas acesas: " + quantidadeAcesas);
                    System.out.println("Quantidade de lâmpadas apagadas: " + quantidadeApagadas);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                }
            }
        }
}

                
