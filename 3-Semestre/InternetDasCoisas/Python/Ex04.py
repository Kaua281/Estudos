import random
import os

print("Bem vindo ao jogo da adivinhação\nUm número de 1 a 100 será sorteado, tente acertar o número")
NRandom = random.randint(1,100)
contador = 0
while True:
    print(f"Você deu {contador} palpites")
    y = int(input("Digite um número"))
    if y == NRandom:
        print(f"O número sorteado é {NRandom}, você acertou")
        break
    elif y>NRandom:
        print(f"Você errou, {y} é maior que o número sorteado")
    elif y<NRandom:
        print(f"Você errou, {y} é menor que o número sorteado")
    contador+=1
    os.system('cls')
