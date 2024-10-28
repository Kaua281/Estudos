import customtkinter as ctk
from deep_translator import GoogleTranslator as gt

def traduzir():
    textoPTraduzir = entrada.get()
    idioma = lang_to_var.get()
    saida = gt(source='auto', target=idioma).translate(textoPTraduzir)
    translated_text.delete(0,'end')
    translated_text.insert(0, saida)

ctk.set_appearance_mode("dark")
ctk.set_default_color_theme("green")
tela = ctk.CTk()
tela.minsize(500,600)
tela.maxsize(800,700)
tela.geometry('600x500')

ctk.CTkLabel(tela, text='Tradutor Universal V1.0', font=('Arial', 25, 'bold'), text_color='green').pack(pady=5)

ctk.CTkLabel(tela, text='Texto para traduzir',font=('Arial', 18, 'bold')).pack(pady=10)

entrada = ctk.CTkEntry(tela, width=500,height=50)
entrada.pack(pady=10)

ctk.CTkLabel(tela, text='Escolha a linguagem para tradução',font=('Arial', 18, 'bold')).pack(pady=10)

lang_to_var = ctk.StringVar(value='english')
lang_to = ctk.CTkOptionMenu(tela, width= 500, height=50, values=gt().get_supported_languages(), variable=lang_to_var)
lang_to.pack(pady=5)
lang_to_var.set('english')

ctk.CTkLabel(tela, text='Texto traduzido',font=('Arial', 18, 'bold')).pack(pady=10)
translated_text = ctk.CTkEntry(tela, width=500,height=50)
translated_text.pack()

botao = ctk.CTkButton(tela, text='Traduzir', width=400, height=50, command=traduzir).pack(pady=15)

tela.mainloop()

