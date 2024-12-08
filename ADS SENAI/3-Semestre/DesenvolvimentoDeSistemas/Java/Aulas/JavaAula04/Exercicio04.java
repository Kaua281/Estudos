//4 -UMA OPERADORA DE TELEFONA COBRA R$ 50 POR UM PLANO BÁSICO QUE DÁ DIREITO A 100 MINUTOS DE TELEFONE. CADA MINUTO QUE EXCEDER A FRANQUIA DE 100 MINUTOS CUSTA R$ 2. FAZER UM PROGRAMA PARA LER A QUANTIDADE DE MINUTOS QUE UMA PESSOA CONSUMIU, DAÍ MOSTRAR O VALOR A SER PAGO.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quantos minutos no telefone você usou: ");
        int min = scanner.nextInt();
        scanner.close();
        if (min <= 100) {
            System.out.println("Você está no plano e pagará somente R$50");
        }else if (min >100) {
            int minExc = min - 100;
            int valorDoExc = minExc * 2;
            System.out.println("Você ultrapassou o plano básico e terá de pagar R$"+valorDoExc+" + R$50 totalizando R$"+ (valorDoExc+50));
        }
    }
}
