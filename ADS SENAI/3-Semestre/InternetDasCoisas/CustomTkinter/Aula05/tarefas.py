import customtkinter as ctk
from tkinter import *
from tkinter import messagebox

def adicionarTarefa():
    tarefa = entradaDaTarefa.get()
    if tarefa:
        lista_tarefas.insert(0,tarefa)
        entradaDaTarefa.delete(0,END)
        salvar_tarefa()
    else:
        messagebox.showerror('Error', 'Digite uma tarefa')
        
def removerTarefa():
    selecionado = lista_tarefas.curselection()
    if selecionado:
        lista_tarefas.delete(selecionado[0])
        salvar_tarefa()
    else:
        messagebox.showerror('Error', 'Selecione uma tarefa')

def salvar_tarefa():
    with open('E:/Programação/3-Semestre/InternetDasCoisas/CustomTkinter/Aula05/tarefas.txt', 'w') as t:
        tarefa = lista_tarefas.get(0,END)
        for x in tarefa:
            t.write(x+"\n")
        
def carregarTarefas():
    with open('E:/Programação/3-Semestre/InternetDasCoisas/CustomTkinter/Aula05/tarefas.txt', 'r') as t:
        tarefas = t.readlines()
        for x in tarefas:
            lista_tarefas.insert(0, x.strip())

ctk.set_appearance_mode("dark")
janela = ctk.CTk()
janela.geometry('350x480')
janela.title('Lista de Tarefas v1.0')

titulo = ctk.CTkLabel(janela, text = "Lista de tarefas",font=('Arial',30,'bold'))
titulo.pack(padx=10,pady=10)

add = ctk.CTkButton(janela,width= 100, text="Adicionar", fg_color='darkblue', text_color='white',hover_color = 'darkgreen', cursor='hand2', command= adicionarTarefa)
add.place(x=30, y = 60)

remove = ctk.CTkButton(janela,width=100, text="Remover", fg_color='darkred', text_color='white',hover_color = 'darkgreen', cursor = 'hand2', command= removerTarefa)
remove.place(x=220, y = 60) 

entradaDaTarefa  = ctk.CTkEntry(janela, width=300,height=50,placeholder_text='Digite sua tarefa: ')
entradaDaTarefa.pack(pady=40)

titulo2 = ctk.CTkLabel(janela, text = "Tarefas Atuais",font=('Arial',20,'bold'), width=20)
titulo2.place(x = 100, y = 150)

lista_tarefas = Listbox(janela, width=40, height= 15, font=('Arial',10,'bold') )
lista_tarefas.place(x = 32, y = 180)

carregarTarefas()
janela.mainloop()