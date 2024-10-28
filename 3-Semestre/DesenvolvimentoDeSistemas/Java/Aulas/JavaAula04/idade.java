// 2-CRIE UM PROGRAMA QUE SOLICITE A IDADE DE UMA PESSOA E EXIBA SE ELA É CRIANÇA (0-12 ANOS), ADOLESCENTE(13-17 ANO), ADULTO (18-59 ANOS) OU IDOSO(60 ANOS OU MAIS).

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.close();
        if (idade <= 12) {
            System.out.println("Você é uma criança");
        }
        else if (13 < idade && idade < 17 ){
            System.out.println("Você é um adolescente");
        }
        else if (18 < idade && idade < 59) {
            System.out.println("Você é um adulto");
        }
        else if (60 < idade){
            System.out.println("Você é um idoso");
        }
    }
}
