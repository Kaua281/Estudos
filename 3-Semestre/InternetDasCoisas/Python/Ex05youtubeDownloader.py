import customtkinter as ctk
import tkinter
from tkinter import*
from pytube import YouTube

#Funções
def Baixar():
    try:
        ytlink=link.get()
        ytobject=YouTube(ytlink)
        video=ytobject.streams.get_highest_resolution()
        video.download()
        nome_video.configure(text=ytobject.title)
        textofinal.configure(text='Download completo', font=('Arial',25,'bold'))
    except:
        textofinal.configure(text='Erro no download ou link invalido', font=('Arial',25,'bold'))






ctk.set_appearance_mode('dark')

janela = ctk.CTk()
janela.geometry('800x400')
janela.title('Youtube Downloader V1.0 Rick')

ctk.CTkLabel(janela, text='Youtube Downloader V1.0 Rick',
             font=('Arial',30,'bold'),text_color='green').pack(pady=10)

link = ctk.CTkEntry(janela,width=650,height=50,
                    placeholder_text='Cole aqui a URL do video')
link.pack(pady=10)



nome_video = ctk.CTkLabel(janela, text='',
                          font=('Arial',20,'bold'),text_color='green')
nome_video.pack(pady=5)

textofinal = ctk.CTkLabel(janela, text='',
                          font=('Arial',16,'bold'),text_color='white')
textofinal.pack(pady=5)


progeresso = ctk.CTkLabel(janela, text='0%',
                          font=('Arial',18,'bold'),text_color='white')
progeresso.pack(pady=5)

barradeprogresso = ctk.CTkProgressBar(janela,width=650,
                                        height=25,progress_color='green')

barradeprogresso.set(0)
barradeprogresso.pack(pady=10)

btn = ctk.CTkButton(janela,text='Download',font=('arial',20,'bold'), fg_color='green',hover_color='darkgreen', command=Baixar)

btn.pack(pady=10)








janela.mainloop()