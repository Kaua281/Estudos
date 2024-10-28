package JavaAula12;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


// Restante das classes do reino animal...

public class Main {
    public static Animal criarAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tipo de animal (mamifero/ave/reptil/anfibio/peixe): ");
        String tipo = scanner.nextLine();

        System.out.print("Digite o nome do animal: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o gênero do animal: ");
        String genero = scanner.nextLine();

        System.out.print("Digite a idade do animal: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        switch (tipo.toLowerCase()) {
            case "mamifero":
                System.out.print("Digite a raça do mamifero: ");
                String raca = scanner.nextLine();
                scanner.close();
                return new Mamifero(nome, idade, genero, raca);
            case "ave":
                System.out.print("A ave voa (sim/não): ");
                String voa = scanner.nextLine();
                if (voa.toLowerCase().equals("sim")) {
                    scanner.close();
                    return new Ave(nome, idade, genero, true);
                } else if (voa.toLowerCase().equals("não")) {
                    scanner.close();
                    return new Ave(nome, idade, genero, false);
                }
                break;
            case "anfibio":
                System.out.print("Digite a classificação do anfíbio: ");
                String classificacao = scanner.nextLine();
                scanner.close();
                return new Anfibio(nome, idade, genero, classificacao);
            case "peixe":
                System.out.print("Digite se o peixe é cartilaginoso ou ósseo: ");
                String cartilOuOsseo = scanner.nextLine();
                scanner.close();
                return new Peixe(nome, idade, genero, cartilOuOsseo);
            case "reptil":
                System.out.print("Digite o grupo do réptil: ");
                String grupo = scanner.nextLine();
                scanner.close();
                return new Repteis(nome, idade, genero, grupo);
            default:
                System.out.println("Classe de animal inválida");
                scanner.close();
                return null;
                

        }
        scanner.close();
        return null;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animais = new ArrayList<>();

        while (true) {
            System.out.println("1 - adicionar um animal\n2 - listar animais\n3 - encerrar programa");
            int acao = scanner.nextInt();
            if (acao == 1) {
                Animal animal = criarAnimal();
                animais.add(animal);
            }
            else if (acao == 2) {
                for (Animal anima : animais) {
                    System.out.println(anima.toString());
                    /*if (anima instanceof Mamifero) {
                        System.out.println(anima.toString());
                    }*/
                }
            } 
            else if(acao == 3) {
                break;
            }
        }
        scanner.close();

    }
}


