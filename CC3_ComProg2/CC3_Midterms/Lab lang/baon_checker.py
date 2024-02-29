baon = float(input("Magkano baon: "))
gastos = input("Magkano gastos: ").lower()
while gastos != "exit":
    baon -= float(gastos)
    if baon <= 0:
        print("Wala ka nang baon :<")
        break
    gastos = input("Magkano gastos: ").lower()
print(f"Remaining baon: {baon}")
