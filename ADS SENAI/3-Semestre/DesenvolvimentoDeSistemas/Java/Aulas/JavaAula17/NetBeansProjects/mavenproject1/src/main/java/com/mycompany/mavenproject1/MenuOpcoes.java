/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

public class MenuOpcoes {

    // Array para armazenar os nomes inseridos
    private static String[] nomes = new String[100];
    // Variável para controlar o número de nomes inseridos
    private static int contador = 0;

    public static void main(String[] args) {
        int opcao;
        do {
            opcao = exibirMenu();
            switch (opcao) {
                case 1:
                    inserir();
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

    public static int exibirMenu() {
        String[] opcoes = {"Inserir", "Listar", "Excluir", "Sair"};
        return JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]) + 1;
    }

    public static void inserir() {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome:");
        if (nome != null) {
            nomes[contador++] = nome;
            JOptionPane.showMessageDialog(null, "Nome inserido: " + nome);
        }
    }

    public static void listar() {
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum nome inserido ainda.");
            return;
        }

        StringBuilder listaNomes = new StringBuilder("Nomes inseridos:\n");
        for (int i = 0; i < contador; i++) {
            listaNomes.append(nomes[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaNomes.toString());
    }

    public static void excluir() {
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum nome para excluir.");
            return;
        }

        String nomeExcluir = JOptionPane.showInputDialog(null, "Digite o nome a ser excluído:");
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (nomes[i].equalsIgnoreCase(nomeExcluir)) {
                encontrado = true;
                // Remove o nome encontrado movendo os nomes posteriores uma posição para frente
                for (int j = i; j < contador - 1; j++) {
                    nomes[j] = nomes[j + 1];
                }
                contador--;
                JOptionPane.showMessageDialog(null, "Nome '" + nomeExcluir + "' excluído com sucesso.");
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Nome não encontrado.");
        }
    }
}