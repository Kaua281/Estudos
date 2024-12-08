import customtkinter as ct

ct.set_appearance_mode("dark")

def calculo():
    dist = int(distancia.get())
    cons = int(consumo.get())
    prec = float(preco.get())
    resul = (dist/cons) * prec
    resultado.configure(text = f'O valor final da viagem foi R${resul:.2f}')



tela = ct.CTk()
tela.geometry('600x500')

titulo = ct.CTkLabel(tela, text= "Calcular Consumo de Gasolina", font= ('Arial',35, 'bold'), text_color='darkgreen')
titulo.pack(padx = 20, pady = 15)

distancia = ct.CTkEntry(tela, placeholder_text= "Digite a distância percorrida:", width=500, height=50,font= ('Arial',20, 'bold'))
distancia.pack(padx=20,pady=15)

consumo = ct.CTkEntry(tela, placeholder_text= "Digite o consumo:", width=500, height=50,font= ('Arial',20, 'bold'))
consumo.pack(padx = 20, pady=15)

preco = ct.CTkEntry(tela, placeholder_text= "Digite o preço do litro da gasolina:", width=500, height=50,font= ('Arial',20, 'bold'))
preco.pack(padx = 20, pady=15)

botao = ct.CTkButton(tela, text="Calcular", width=300, height=50,font= ('Arial',20, 'bold'), command=calculo)
botao.pack(pady=15)

resultado = ct.CTkLabel(tela, text='', font= ('Arial',20, 'bold'))
resultado.pack(pady=20)

tela.mainloop()