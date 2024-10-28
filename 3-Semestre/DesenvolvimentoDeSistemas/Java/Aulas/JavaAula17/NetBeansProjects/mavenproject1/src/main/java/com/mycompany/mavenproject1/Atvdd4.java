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
public class Atvdd4 {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null, "Você gostaria de continuar?",
                "Opções", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Você escolheu continuar"
                    , "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null, "Você escolheu cancelar"
                , "Aviso", JOptionPane.INFORMATION_MESSAGE);
        
        }
    }
}
