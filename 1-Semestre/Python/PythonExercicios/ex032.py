x = int(input("Digite um ano: "))
if x % 4 == 0 and x % 100 != 0 or x % 400 == 0:
    print(f" {x} é um ano bissexto")
else:
    print(f" {x} não é um ano bissexto")