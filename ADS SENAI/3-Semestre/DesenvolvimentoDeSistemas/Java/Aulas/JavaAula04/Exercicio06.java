import java.util.Scanner;
public class Exercicio06 {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("##--     Menu de frutas   --##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - Maçã              |\n");
        System.out.print("| Opção 2 - Banana            |\n");
        System.out.print("| Opção 3 - Laranja           |\n");
        System.out.print("| Opção 4 - Morango           |\n");
        System.out.print("| Opção 5 - Abacaxi           |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = scanner.nextInt();
        scanner.close();

        switch (opcao) {
        case 1:
            System.out.print("\nA maçã é o pseudofruto pomáceo da macieira (Malus domestica)");
            break;

        case 2:
            System.out.print("\nBanana é uma pseudobaga da bananeira, uma planta herbácea vivaz acaule da família Musaceae\n");
            break;

        case 3:
            System.out.print("\nA laranja é um fruto de várias espécies cítricas da família Rutaceae\n");
            break;

        case 4:
            System.out.print("\nO morango é uma fruta vermelha, cuja origem é a Europa. Produzida pelo morangueiro, é um fruto rasteiro. \n");
            break;

        case 5:
            System.out.print("\nO abacaxi (Ananas comosus) é uma infrutescência tropical produzida pela planta de mesmo nome\n");
            break;

        default:
            System.out.print("\nOpção Inválida!");
            break;
    
        }
    }

}