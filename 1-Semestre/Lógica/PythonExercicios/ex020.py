from random import sample
N1 = str(input('Qual o primeiro aluno?'))
N2 = str(input('Qual o segundo aluno?'))
N3 = str(input('Qual o terceiro aluno?'))
N4 = str(input('Qual o quarto aluno?'))
lista = (N1, N2, N3, N4)
Ord = sample(lista, k=4)
print('A ordem de apresentação será {}'.format(Ord))
