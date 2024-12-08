vc = float(input("Digite o valor da casa: R$"))
sal = float(input("Digite o valor do seu salário: R$"))
anos = float(input("Digite em quantos anos pretende pagar o empréstimo: "))
prestM = vc / (anos * 12)
vsal = sal * 30 /100
print(f"Para comprar um casa de {vc} R$ em {anos} anos a prestação mensal será de {prestM} R$ ")
if prestM >= vsal:
    print("A prestação supera 30% do seu salário, EMPRÉSTIMO NEGADO!")
else:
    print("O empréstimo pode ser APROVADO")