/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Message {
    public static void main(String[] args) {
        String[] opcoes = {"Opção 1","Opção 2", "Opção 3"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção",
                "Opções", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
        if (escolha != JOptionPane.CLOSED_OPTION){
            JOptionPane.showMessageDialog(null, "Você escolheu: "+opcoes[escolha]
                    , "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Você cancelou a seleção"
                , "Aviso", JOptionPane.INFORMATION_MESSAGE);
        
        }
    }
    
}
