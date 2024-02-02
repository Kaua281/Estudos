sal = float(input('Qual o valor do salário a ser reajustado?'))
reaj = float(input('Qual o  valor do reajuste?'))
nsal = sal + (sal*reaj/100)
print('Um funcionario que ganhava {:.2f} reais com o reajuste de {}% agora ganhará {:.2f} reais'.format(sal, reaj, nsal))