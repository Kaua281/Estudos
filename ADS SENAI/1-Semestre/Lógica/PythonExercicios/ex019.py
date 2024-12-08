from random import choice
A1 = str(input('Qual o primeiro aluno?'))
A2 = str(input('Qual o segundo aluno?'))
A3 = str(input('Qual o terceiro aluno?'))
A4 = str(input('Qual o quarto aluno?'))
Lista = (A1, A2, A3, A4)
Sort = choice(Lista)
print("O aluno sorteado para apagar o quadro foi {}".format(Sort))
