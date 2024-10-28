/*
 * Nesta atividade, você irá desenvolver um programa em Java
que permitirá ao usuário interagir com diferentes tipos de pessoas.
O programa utilizará conceitos de  encapsulamento e a interface gráfica JOptionPane para interação com o usuário.
Cadastrar pessoa: O usuário poderá cadastrar pessoas informando seu nome, idade e e-mail. As pessoas cadastradas serão armazenados em um array. 
 Listar pessoas: O usuário poderá visualizar todas as pessoas cadastrados até o momento.
 Excluir: O usuário poderá selecionar uma pessoa cadastrada e excluir. 
 Sair: Encerra a execução do programa.
 */
package com.mycompany.javaaula18;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class JavaAula18 {

    static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static int contador = 0;

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = exibirMenu();
            switch (opcao) {
                case 1:
                    Pessoa pessoa = cadastrar();
                    pessoas.add(pessoa);
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    excluir();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
    }

    private static void excluir() {
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum nome para excluir.");
            return;
        }

        String nomeExcluir = JOptionPane.showInputDialog(null, "Digite o nome da pessoa que deseja excluir: ");
        for (Pessoa pesso : pessoas) {
            if (pesso.getNome().equalsIgnoreCase(nomeExcluir)) {
                int resposta = JOptionPane.showConfirmDialog(null,
                        "Você realmente deseja excluir?\n" + pesso.toString(),
                        "Opções", JOptionPane.YES_NO_OPTION);

                if (resposta == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, pesso.toString() + "\n\nExcluído com sucesso.");
                    pessoas.remove(pesso);
                    break;

                } else {
                    JOptionPane.showMessageDialog(null, "Você cancelou a operação", "Aviso",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nome não encontrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }

        /*
         * int nomeExcluir = Integer.parseInt(JOptionPane.showInputDialog(null,
         * "Digite o ID da pessoa que deseja excluir: "));
         * int resposta = JOptionPane.showConfirmDialog(null,
         * "Você realmente deseja excluir?\n"+"ID: "+nomeExcluir+" - " +
         * pessoas.get(nomeExcluir-1),
         * "Opções", JOptionPane.YES_NO_OPTION);
         * 
         * if (resposta == JOptionPane.YES_OPTION){
         * JOptionPane.showMessageDialog(null, "ID: "+nomeExcluir+" - " +
         * pessoas.get(nomeExcluir-1) + "\n\nExcluído com sucesso.");
         * pessoas.remove(nomeExcluir-1);
         * 
         * } else{
         * JOptionPane.showMessageDialog(null, "Você cancelou a operação"
         * , "Aviso", JOptionPane.INFORMATION_MESSAGE);
         * 
         * }
         */
    }

    private static void listar() {
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum nome inserido ainda.");
            return;
        }

        StringBuilder listaNomes = new StringBuilder("Nomes inseridos:\n");
        for (Pessoa pesso : pessoas) {
            listaNomes.append("ID: " + (pessoas.indexOf(pesso) + 1) + " - " + pesso.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaNomes.toString());
    }

    private static Pessoa cadastrar() {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade"));
        String email = JOptionPane.showInputDialog(null, "Digite o email:");
        contador++;
        return new Pessoa(nome, idade, email);

    }

    public static int exibirMenu() {
        String[] opcoes = { "Cadastrar", "Listar", "Excluir", "Sair" };
        return JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]) + 1;
    }
}
