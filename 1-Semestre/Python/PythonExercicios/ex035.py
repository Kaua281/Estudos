x = int(input("Digite o comprimento da primeira reta: "))
y = int(input("Digite o comprimento da segunda reta: "))
z = int(input("Digite o comprimento da terceira reta: "))
if x < y + z and y < x + z and z < y + x:
    print("De acordo com a condição de existência do triângulo essa três retas podem formar um triângulo")
else:
    print("De acordo com a condição de existência do triângulo essa três retas não podem formar um triângulo")