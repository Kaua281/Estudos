/*CRIE UM PROGRAMA EM JAVA QUE CADASTRE 3 CONTATOS TELEFÔNICOS COML NOME E NÚMERO, PROGRAMA DEVERÁ LISTAR OS CONTATOS CADASTRADOS E EXCLUIR.
NO PROGRAMA DEVEM TER AS OPÇÕES PARA ESCOLHA:
1-CADASTRO
2-LISTAR
3-EXCLUIR
4-SAIR
OS CONTATOS DEVEM SER ARMAZENADOS EM UM ARRAYLIST */


import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        ArrayList<String> Contatos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\n1-CADASTRO\n2-LISTAR\n3-EXCLUIR\n4-SAIR\nSelecione a opção desejada: ");
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                for (int i = 0; i < 1; i++) {
                    System.out.print("Digite o nome do contato (SEM DAR ESPAÇOS): ");
                    String contato = scanner.next();

                    System.out.print("Digite o telefone do contato (SEM DAR ESPAÇOS): ");
                    String telefone = scanner.next();
                    Contatos.add(contato + ": " + telefone);
                    System.out.println("Deseja adicionar mais contatos?\n1-Sim\n2-Não");
                    int AddMais = scanner.nextInt();
                    if (AddMais == 1) {
                        i--;
                    } else if (AddMais == 2) {
                        continue;
                    }
                }
            } else if (opcao == 2) {
                if (Contatos.size() > 0) {
                    for (String contato : Contatos) {
                        System.out.println("["+(Contatos.indexOf(contato)+1)+"] - "+contato);
                    }
                } else {
                    System.out.println("A lista de contatos está vazia");
                }
            } else if (opcao == 3) {
                while (true) {
                    if (Contatos.size() > 0) {
                        System.out.print("Digite o indice do contato que você deseja excluir: ");
                        int Excluir = scanner.nextInt();
                        System.out.println("Excluindo contato " + Contatos.get(Excluir - 1));
                        Contatos.remove(Excluir - 1);

                        System.out.println("Deseja excluir mais contatos?\n1-Sim\n2-Não");
                        int ExcluirMais = scanner.nextInt();
                        if (ExcluirMais == 1) {
                            continue;
                        } else if (ExcluirMais == 2) {
                            break;
                        } else{
                            System.out.println("opção invalida");
                            break;
                        }
                    }
                    else {
                        System.out.println("A lista de contatos está vazia");
                        break;
                    }
                }
            } else if (opcao == 4) {
                System.out.println("Encerrando Programa");
                break;
            }
        }
        scanner.close();
    }
}