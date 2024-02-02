x = float(input("Digite o valor do salário: "))
if x > 1250.00:
    y = x / 10
    rea = x + y
    print(f"Você terá um aumento de {y} no seu salario de {x} totalizando {rea}")
else:
    y = (x / 100) * 15
    rea = x + y
    print(f"Você terá um aumento de {y} no seu salario de {x} totalizando {rea}")