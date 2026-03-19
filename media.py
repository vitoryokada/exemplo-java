nota01 = float(input("Digite a primeira nota: "))
nota02 = float(input("Digite a segunda nota: "))

media = (nota01 + nota02) / 2

if media >= 6:
    print(f"Sua media é: {media} então está APROVADO")
else:
    print(f"Sua media é: {media} então está REPROVADO")