Algoritmo sumaYMayores
	Dimension m[30]
	sumaTotal <- 0
	nMayores <- 0
	Para i<-0 Hasta 29 Con Paso 1 Hacer
		Escribir "Introduzca el número ", i+1, "."
		Leer m[i]
		Si m[i] > 10 Entonces
			nMayores <- nMayores + 1
		FinSi
		sumaTotal <- sumaTotal + m[i]
	FinPara
	Escribir "La suma de todos los elementos es: ", sumaTotal
	Escribir "El número de elementos mayores de 10 es: ", nMayores
FinAlgoritmo
