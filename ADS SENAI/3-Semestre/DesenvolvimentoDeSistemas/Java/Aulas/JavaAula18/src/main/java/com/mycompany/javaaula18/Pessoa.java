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


public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    public Pessoa(String nome, int codigo, String email) {
        this.nome = nome;
        this.idade = codigo;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Nome: " + nome + "\n           Idade: " + idade + "\n           Email: " + email;
    }

    
    
}
