import customtkinter as ct

ct.set_appearance_mode("dark")

def calculo():
    nom = (nome.get())
    pes = float(peso.get())
    altur = float(altura.get())
    imc = pes/(altur*altur)
    ximc = ''
    if imc < 18.6:
        ximc = "Abaixo do peso"
    elif imc >= 18.5 and imc < 24.9:
        ximc = "peso ideal"
    elif imc >=25 and imc < 29.9:
        ximc ="Sobrepeso"
    else:
        ximc = "Obesidade"
    resultado.configure(text = f'Olá Sr(a) {nom}, seu imc foi {imc:.2f} e você está com {ximc}')

def limpar():
    resultado.configure(text = '' )
    nome.delete(0,'end')
    peso.delete(0,'end')
    altura.delete(0,'end')


tela = ct.CTk()
tela.minsize(500,600)
tela.maxsize(800,700)
tela.geometry('600x500')

titulo = ct.CTkLabel(tela, text= "Calcular o IMC", font= ('Arial',35, 'bold'), text_color='red')
titulo.pack(padx = 20, pady = 15)

nome = ct.CTkEntry(tela, placeholder_text= "Digite seu nome:", width=500, height=50,font= ('Arial',20, 'bold'))
nome.pack(padx=20,pady=15)

peso = ct.CTkEntry(tela, placeholder_text= "Digite seu peso:", width=500, height=50,font= ('Arial',20, 'bold'))
peso.pack(padx = 20, pady=15)

altura = ct.CTkEntry(tela, placeholder_text= "Digite sua altura:", width=500, height=50,font= ('Arial',20, 'bold'))
altura.pack(padx = 20, pady=15)

botao = ct.CTkButton(tela, text="Calcular", width=300, height=50,font= ('Arial',20, 'bold'),fg_color='darkred', text_color='white',hover_color = 'darkgreen', command=calculo)
botao.pack(pady=15)

resultado = ct.CTkLabel(tela, text='', font= ('Arial',20, 'bold'))
resultado.pack(pady=20)

botao2 = ct.CTkButton(tela, text="Limpar", width=300, height=50,font= ('Arial',20, 'bold'),fg_color='darkred', text_color='white',hover_color = 'darkgreen', command=limpar)
botao2.pack(pady=15)

tela.mainloop()