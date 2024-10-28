x = int(input("Digite a distância até onde deseja viajar em Km: "))
if x <= 200:
    y = x * 0.50
    print(f"O preço da passagem será de {y} Reais")
else:
    y = x * 0.45
    print(f"O preço da passagem será de {y} Reais")