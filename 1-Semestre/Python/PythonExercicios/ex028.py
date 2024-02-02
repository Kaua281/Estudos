import random
x = random.randint(0, 5)
y = input("Tente adivinhar um número de 0 a 5 escolhido pelo computador: ")
if y == x:
    print(f"Parabéns, você acertou o número sorteado pelo computador {x}")
else:
    print(f"Ops, você errou! O número sorteador era {x}")
