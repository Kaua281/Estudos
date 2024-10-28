package JavaAula10;

import java.util.Scanner;

public class carroApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro01 = new Carro("Ford", "FordCar", "1985");
        
        System.out.println(carro01.toString());
        carro01.setAnoDeFabricacao(scanner.next());
        System.out.println(carro01.toString());
        scanner.close();
    }
    
}
