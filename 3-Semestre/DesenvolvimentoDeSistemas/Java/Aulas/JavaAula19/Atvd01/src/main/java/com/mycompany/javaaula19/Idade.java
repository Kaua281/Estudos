/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaaula19;


import javax.swing.JOptionPane;

public class Idade {

    public static void main(String[] args) {
            String nome = JOptionPane.showInputDialog(null, "Digite o seu nome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));

            if ((idade > 0) && (idade <= 2)) {
                JOptionPane.showMessageDialog(null, "Olá " + nome + " , você é um bebê");
            }
            else if  ((idade >= 3) && (idade <= 11)) {
                JOptionPane.showMessageDialog(null, "Olá " + nome + " , você é uma criança");
            }
            else if ((idade >= 12) && (idade <= 19)) {
                JOptionPane.showMessageDialog(null, "Olá " + nome + " , você é um adolescente");
            }
            else if ((idade >= 20) && (idade <= 30)) {
                JOptionPane.showMessageDialog(null, "Olá " + nome + " , você é um jovem");
            }
            else if ((idade >= 31) && (idade <= 60)) {
                JOptionPane.showMessageDialog(null, "Olá " + nome + " , você é um adulto");
            }
            else if ((idade >= 60)) {
                JOptionPane.showMessageDialog(null, "Olá " + nome + " , você é um idoso");
            } 
            else {
                JOptionPane.showMessageDialog(null, "Insira uma idade valida");
            }
        
        
        }

}
