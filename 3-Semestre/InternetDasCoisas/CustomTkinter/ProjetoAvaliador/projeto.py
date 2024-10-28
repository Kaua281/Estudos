import matplotlib.pyplot as plt
from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg, NavigationToolbar2Tk
import customtkinter as ctk
import numpy as np
import matplotlib.figure

def funcao_primeiro_grau(x, b, c):
    return b * x + c
def funcao_segundo_grau(x, a, b, c):
    return a * x**2 + b * x + c

def plot():
    funcao = entrada.get()
    ax.clear()
    termos = funcao.replace("-", "- ").split()  # Adiciona um espaço após cada sinal de subtração para simplificar a divisão

    # Inicializa os coeficientes
    a = b = c = 0.0

    # Verifica se a função é de primeiro grau
    if "x" in funcao and "x^2" not in funcao:
        for i, termo in enumerate(termos):
            # Verifica se o termo contém "x"
            if "x" in termo:
                # Se o termo não for vazio, converte para float
                if termo.replace("x", ""):
                    b = float(termo.replace("x", ""))
                else:
                    b = 1.0  # Se nenhum coeficiente for especificado, assume-se 1.0
                # Verifica o sinal
                if i > 0 and termos[i - 1] == "-":
                    b *= -1  # Multiplica por -1 se o termo anterior for "-"
            # Se não for um termo com 'x', é o termo independente 'c'
            elif termo.replace(".", "").isdigit():
                # Converte para float
                c = float(termo)
                # Verifica o sinal
                if i > 0 and termos[i - 1] == "-":
                    c *= -1  # Multiplica por -1 se o termo anterior for "-"

    # Se não for de primeiro grau, utiliza a lógica anterior para funções de segundo grau
    else:
        for i, termo in enumerate(termos):
            if "x^2" in termo:
                if termo.replace("x^2", ""):
                    a = float(termo.replace("x^2", ""))
                else:
                    a = 1.0
                if i > 0 and termos[i - 1] == "-":
                    a *= -1
            elif "x" in termo and "^2" not in termo:
                if termo.replace("x", ""):
                    b = float(termo.replace("x", ""))
                else:
                    b = 1.0
                if i > 0 and termos[i - 1] == "-":
                    b *= -1
            elif termo.replace(".", "").isdigit():
                c = float(termo)
                if i > 0 and termos[i - 1] == "-":
                    c *= -1

    # Verifica se 'a' é diferente de zero para determinar o tipo de função
    tipo = "segundo_grau" if a != 0 else "primeiro_grau"

    if tipo == "primeiro_grau":
        valoresDeX = np.linspace(-10, 10, 100)
        valoresDeY = funcao_primeiro_grau(valoresDeX, b, c)
        ax.plot(valoresDeX, valoresDeY, label=(f"f(x) = {funcao}"))
        canvas.draw()

    elif tipo == "segundo_grau":
        valoresDeX = np.linspace(-10, 10, 100)
        valoresDeY = funcao_segundo_grau(valoresDeX, a, b, c)
        ax.plot(valoresDeX, valoresDeY, label=(f"f(x) = {funcao}"))
        canvas.draw()

# Initialize CustomTkinter and Matplotlib Figure
ctk.set_appearance_mode("dark")
ctk.set_default_color_theme("green")
janela = ctk.CTk()
fig = matplotlib.figure.Figure()
ax = fig.add_subplot()

# CustomTkinter Application
label = ctk.CTkLabel(janela,text = "Gerador de gráfico!",font=("Courier", 32))
label.pack()

exemplos = ctk.CTkLabel(janela, text="Exemplos:\n2x + 3\nx^2 - 2x + 1")
exemplos.place(x=5, y = 50)
entrada = ctk.CTkEntry(janela, width=500,height=50,placeholder_text='Digite uma função do 1° ou 2° grau')
entrada.pack(pady=10)

# Create Canvas
canvas = FigureCanvasTkAgg(fig, master=janela)  
canvas.get_tk_widget().pack(side=ctk.TOP, fill=ctk.BOTH, expand=1)

toolbar = NavigationToolbar2Tk(canvas, janela, pack_toolbar = False)
#toolbar.config(background="#d469a3")
toolbar.update()
toolbar.pack(anchor="w", fill='both')

botao = ctk.CTkButton(janela, text='Gerar', width=400, height=50, command=plot).pack(pady=15)


janela.mainloop()
