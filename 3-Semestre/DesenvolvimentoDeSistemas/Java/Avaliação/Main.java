/*
 Equipe:
    Kauã Oliveira Seixas
    Luis Henrique Santos Batista
    Júlio César Silva Costa
    Rivaldo Jesus Santos
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ArCondicionado> ArCondicionados = new ArrayList<>();
        while (true) {
            System.out.print(
                    "1 - Cadastrar ArCondicionado\n2 - listar ArCondicionado\n3 - encerrar programa\nDigite sua ação: ");
            int acao = scanner.nextInt();
            scanner.nextLine();
            if (acao == 1) {
                System.out.print("Digite o modelo do ArCondicionado: ");
                String modelo = scanner.nextLine();
                if (modelo.toLowerCase().equals("splinter")) {
                    System.out.print("Digite o código do ArCondicionado: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Digite a marca do ArCondicionado: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite os btus do ArCondicionado: ");
                    float BTU = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.print("Digite se ele tem um defeito, caso sim, qual: ");
                    String defeito = scanner.nextLine();
                    System.out.print("Digite o tipo do ArCondicionado: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Digite o tamanho do ArCondicionado: ");
                    float tamanho = scanner.nextFloat();
                    ArCondicionados.add(new Splinter(modelo, codigo, marca, BTU, defeito, tipo, tamanho));

                }
                else if (modelo.toLowerCase().equals("portatil")) {
                    System.out.print("Digite o código do ArCondicionado: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Digite a marca do ArCondicionado: ");
                    String marca = scanner.nextLine();
                    System.out.print("Digite os btus do ArCondicionado: ");
                    float BTU = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.print("Digite se ele tem um defeito, caso sim, qual: ");
                    String defeito = scanner.nextLine();
                    System.out.print("Digite a voltagem do arCondicionado: ");
                    float voltagem = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.print("Digite a cor do arCondicionado: ");
                    String cor = scanner.nextLine();
                    ArCondicionados.add(new Portatil(modelo, codigo, marca, BTU, defeito, voltagem, cor));
                    
                }
            } else if (acao == 2) {
                for (ArCondicionado arC : ArCondicionados) {
                    System.out.println(arC.toString());
                }
            }

            else if (acao == 3) {
                break;
            }

        }
        scanner.close();
        
    }
}