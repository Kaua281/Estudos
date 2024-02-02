day = int(input('Por quantos dias o carro foi alugado?'))
km = float(input('Quantos Km rodados?'))
VASP = day*60 + km*0.15
print('O valor total a ser pago é de {} R$'.format(VASP))