vl = float(input("Digite a velocidade do carro: "))
if vl > 80.00:
    mul = (vl - 80) * 7
    print(f"Você está ultrapassando o limite de velocidade e será multado em {mul} Reais")
else:
    print("Você está abaixo do limite de velocidade e não será multado")