from math import sin, cos, tan, radians
âng = float(input('Digite o Valor do ângulo que você deseja:'))
Seno = sin(radians(âng))
Cos = cos(radians(âng))
Tan = tan(radians(âng))
print('O Seno, o Cosseno e a tangente de {} são respectivamente {:.2f}, {:.2f}, {:.2f}'.format(âng, Seno, Cos, Tan))