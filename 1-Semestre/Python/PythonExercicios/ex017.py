from math import hypot
CatO = float(input('Digite o valor do cateto oposto:'))
CatA = float(input('Digite o valor do cateto adjacente:'))
Hip = hypot(CatA, CatO)
print('A Hipotenusa dos catetos {} e {} vai medir {:.2f}'.format(CatA, CatO, Hip))