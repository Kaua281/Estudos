x = int(input("Digite um número: "))
y = int(input("Digite outro número: "))
z = int(input("Digite outro número: "))
if x > y and x > z:
 print(f"{x} é o maior número")
elif y > x and y > z:
 print(f"{y} é o maior número")
elif z > x and z > y:
  print(f"{z} é o maior número")
if x < y and x < z:
 print(f"{x} é o menor número")
elif y < x and y < z:
 print(f"{y} é o menor número")
elif z < x and z < y:
  print(f"{z} é o menor número")