package Universidade;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("João", "Tempo Integral", 8.5);
        System.out.println("Nome do estudante: " + estudante.getNome());
        System.out.println("Estatuto do estudante: " + estudante.getEstatuto());
        System.out.println("Média do estudante: " + estudante.getMedia());

        Professor professor = new Professor("Maria", 3600);
        System.out.println("Nome do professor: " + professor.getNome());
        System.out.println("Salário do professor: " + professor.getSalario());
    }
}
