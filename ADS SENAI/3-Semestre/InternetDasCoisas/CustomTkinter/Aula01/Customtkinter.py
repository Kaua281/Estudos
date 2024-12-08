import customtkinter as ct

ct.set_appearance_mode("dark")


janela = ct.CTk()
janela.geometry('600x350')
janela.title('Tela de acesso ao sistema')

texto = ct.CTkLabel(janela, text = "Fazer Login",font=('Arial',50,'bold'), text_color='darkgreen')
texto.pack(padx=10,pady=10)

login = ct.CTkEntry(janela, placeholder_text="Digite seu usuário: ", width=300)
login.pack(padx=10,pady=10)

senha = ct.CTkEntry(janela, placeholder_text="Digite sua senha: ", width=300, show ='•')
senha.pack(padx=10,pady=10)

lembrar = ct.CTkCheckBox(janela, text = "Lembrar usuário")
lembrar.pack(padx=10, pady=10)

botao = ct.CTkButton(janela, text="entrar", fg_color='darkred', text_color='white',hover_color = 'darkgreen')
botao.pack(padx=10, pady=10)

janela.mainloop()