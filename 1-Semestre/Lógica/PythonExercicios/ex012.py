preço = float(input('Qual o preço do produto?'))
descont = float(input('Qual o desconto sobre o produto?'))
Pf = preço - (preço*descont/100)
print('O produto que custava {:.2f} reais, com desconto de {}% custará {:.2f} reais'.format(preço, descont, Pf))
