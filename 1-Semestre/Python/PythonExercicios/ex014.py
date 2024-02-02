cel = float(input('Informe a temperatura em graus celsius a ser convertida:'))
fa = (cel*9/5)+32
kev = cel+273.15
print('A temperatura de {}°C corresponde a {}° Fahrenheit e {}° Kelvin'.format(cel, fa, kev))