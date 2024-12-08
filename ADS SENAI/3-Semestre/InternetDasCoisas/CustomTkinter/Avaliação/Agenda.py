"""
Alunos: Júlio César Silva Costa, 
Kauã Oliveira Seixas, 
Rivaldo de Jesus Santos 
Turma: 85366

1) Gere um aplicativo em Python, com interface e implemente uma agenda de contatos
em que o usuário possa adicionar contatos com nome, telefone e e-mail e excluir os
quando necessário e esses contatos serão armazenados em um arquivo (Txt, xls, ou
xml) que funcionará como um “Local Storage” e exibirá os contatos a partir dessa
base. Valor (2,0)"""

import customtkinter as ctk
from tkinter import *
from tkinter import messagebox

def adicionarContato():
    Contato = NomeContato.get()
    Telefone = TelefoneContato.get()
    Email = EmailContato.get()
    if Contato and Telefone and Email:
        lista_Contatos.insert(0,Contato +" - "+Telefone+ " - "+Email)
        NomeContato.delete(0,END)
        TelefoneContato.delete(0,END)
        EmailContato.delete(0,END)
        salvar_Contato()
    else:
        messagebox.showerror('Error', 'Digite as informações do contato')
        
def removerContato():
    selecionado = lista_Contatos.curselection()
    if selecionado:
        lista_Contatos.delete(selecionado[0])
        salvar_Contato()
    else:
        messagebox.showerror('Error', 'Selecione um Contato')

def salvar_Contato():
    with open('E:/Programação/3-Semestre/InternetDasCoisas/CustomTkinter/Avaliação/Contatos.txt', 'w') as t:
        Contato = lista_Contatos.get(0,END)
        for x in Contato:
            t.write(x+"\n")
        
def carregarContatos():
    with open('E:/Programação/3-Semestre/InternetDasCoisas/CustomTkinter/Avaliação/Contatos.txt', 'r') as t:
        Contatos = t.readlines()
        for x in Contatos:
            lista_Contatos.insert(0, x.strip())

ctk.set_appearance_mode("dark")
janela = ctk.CTk()
janela.geometry('380x680')
janela.title('Lista de Contatos v1.0')

titulo = ctk.CTkLabel(janela, text = "Lista de Contatos",font=('Arial',30,'bold'))
titulo.pack(padx=10,pady=25)

add = ctk.CTkButton(janela,width= 100, text="Adicionar", fg_color='darkblue', text_color='white',hover_color = 'darkgreen', cursor='hand2', command= adicionarContato)
add.place(x=40, y = 60)

remove = ctk.CTkButton(janela,width=100, text="Remover", fg_color='darkred', text_color='white',hover_color = 'darkgreen', cursor = 'hand2', command= removerContato)
remove.place(x=240, y = 60) 

NomeContato  = ctk.CTkEntry(janela, width=300,height=50,placeholder_text='Digite o nome do contato: ')
NomeContato.pack(pady=10)

TelefoneContato  = ctk.CTkEntry(janela, width=300,height=50,placeholder_text='Digite o telefone do contato: ')
TelefoneContato.pack(pady=10)

EmailContato  = ctk.CTkEntry(janela, width=300,height=50,placeholder_text='Digite o e-mail do contato: ')
EmailContato.pack(pady=10)

titulo2 = ctk.CTkLabel(janela, text = "Contatos Atuais",font=('Arial',20,'bold'), width=20)
titulo2.place(x = 100, y = 290)

lista_Contatos = Listbox(janela, width=50, height= 15, font=('Arial',10,'bold') )
lista_Contatos.place(x = 12, y = 325)

carregarContatos()
janela.mainloop()