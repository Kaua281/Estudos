"""
Alunos: Júlio César Silva Costa, 
Kauã Oliveira Seixas, 
Rivaldo de Jesus Santos 
Turma: 85366

3) Sistema de Orçamento Financeiro:
Desenvolva um sistema de orçamento financeiro pessoal em uma interface
gráfica. Permita que o usuário insira suas receitas e despesas mensais, calcule o"""


import customtkinter as ctk
from tkinter import *

#funções-------------------------------
def Calculo():
    df1 = float(despesa1.get())
    df2 = float(despesa2.get())
    df3 = float(despesa3.get())
    df4 = float(despesa4.get())
    
    o1 = float(orcamento1.get())
    o2 = float(orcamento2.get())
    
    despesa_final = df1+df2+df3+df4
    receita_final = o1+o2
    
    Resultado_Financeiro = receita_final-despesa_final
    resultado.configure(text= f"Seu Orçamento Financeiro é de: R${Resultado_Financeiro:.2f}")

#--------------------------------------

janela = ctk.CTk("#3D59AB")
janela.title("Sistema de Orçamento financeiro 1.0")
janela.geometry("600x650")

#Title
ctk.CTkLabel(janela,text="Sistema Financeiro", font=("Arial",20,"bold"), text_color="white").pack(pady=5)

#sub_Title
ctk.CTkLabel(janela,text="Despesas", font=("Arial",15,"bold"), text_color="white").pack(pady=5)


#Entry field
despesa1 = ctk.CTkEntry(janela,height=30, width=150, placeholder_text="Despesa",font=("Arial",15))
despesa1.pack(pady=7)

despesa2 = ctk.CTkEntry(janela,height=30, width=150, placeholder_text="Despesa",font=("Arial",15))
despesa2.pack(pady=7)

despesa3 = ctk.CTkEntry(janela,height=30, width=150, placeholder_text="Despesa",font=("Arial",15))
despesa3.pack(pady=7)

despesa4 = ctk.CTkEntry(janela,height=30, width=150, placeholder_text="Despesa",font=("Arial",15))
despesa4.pack(pady=7)

#sub_Title
ctk.CTkLabel(janela,text="Receita", font=("Arial",15,"bold"), text_color="white").pack(pady=5)

orcamento1 = ctk.CTkEntry(janela,height=30, width=150, placeholder_text="Receita",font=("Arial",15))
orcamento1.pack(pady=5)

orcamento2= ctk.CTkEntry(janela,height=30, width=150, placeholder_text="Receita",font=("Arial",15))
orcamento2.pack(pady=5)

action_button = ctk.CTkButton(janela, text="Orçamento",
                              font=("Arial",18,"bold"),text_color="white",width=80,
                              fg_color="darkgreen",
                              corner_radius=5,cursor="hand2",command=Calculo)
action_button.pack(padx=5,pady=5)

#Label
ctk.CTkLabel(janela, text="Orçamento Financeiro",font=("Arial",15,"bold"),text_color="white").pack(pady=5)

resultado = ctk.CTkLabel(janela,width=400,height=70,text="Seu Orcamento Financeiro é de:", font=("Arial",18))
resultado.pack(pady=0)


janela.mainloop()
