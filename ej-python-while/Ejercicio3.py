n1 = 0
n2 = 0
n3 = 0
promedio = 0.
contador = 1
limite = 4
cadena = "{0}{1:>10}{2:>10}{3:>10}{4:>10}\n".format("Nombres", "Nota 1", "Nota 2", "Nota 3", "Promedio")

while contador <= limite:
    nombre = str(input("Ingrese el nombre del estudiante"))
    n1 = int(input("Ingrese la nota 1"))
    n2 = int(input("Ingrese la nota 2"))
    n3 = int(input("Ingrese la nota 3"))
    promedio = (n1+n2+n3)/3
    cadena = "{0}{1}{2:>10}{3:>10}{4:>10}{5:>10.2f}\n".format(cadena, nombre, n1, n2, n3, promedio)

    contador = contador + 1

print(cadena)
