"""
Alunos: Júlio César Silva Costa, 
Kauã Oliveira Seixas, 
Rivaldo de Jesus Santos 
Turma: 85366

2) Jogo de Adivinhação:
Desenvolva um jogo de adivinhação em que o computador escolhe um número aleatório
e o jogador tenta adivinhar qual é. Utilize uma interface gráfica para que o jogador insira
suas tentativas e exiba dicas se o número é maior ou menor. Valor (2,0)"""

import customtkinter as ct
import random
from tkinter import messagebox

def numeroSorteado(event):
    n = palpite.get()
    n1 = int(n)

    if n1 < Sorteado:
        MaiorOuMenor.configure(text=n+' é menor que o número sorteado')
        palpite.delete(0,'end')
    if n1 > Sorteado:
        MaiorOuMenor.configure(text=n+' é maior que o número sorteado')
        palpite.delete(0,'end')
    if n1 == Sorteado:
        MaiorOuMenor.configure(text='Parabéns o número sorteado era '+n)
        palpite.delete(0,'end')

tentativas=0
Sorteado = random.randint(1,100)

ct.set_appearance_mode("dark")
janela = ct.CTk()
janela.title('Jogo da Adivinhação')
janela.geometry('350x200')

text = ct.CTkLabel(janela, text='Jogo da Adivinhação', font=('Arial',20,'bold'))
text.pack(padx=15,pady=15)

palpite = ct.CTkEntry(janela, placeholder_text='Digite um número', width=300)
palpite.pack(padx=10,pady=10)
palpite.bind("<Return>", numeroSorteado)

MaiorOuMenor = ct.CTkLabel(janela, text="", font=('Arial',15,'bold'))
MaiorOuMenor.pack(padx=10,pady=10)


janela.mainloop()