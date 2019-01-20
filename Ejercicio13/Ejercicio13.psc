Algoritmo contVocales
	Definir a Como Cadena
	Definir vocales Como Cadena
	vocales <- "aeiouáéíóúüAEIOUÁÉÍÓÚÜ"
	cont <- 0
	Leer a
	Para i <- 0 Hasta longitud(a)-1 Con Paso 1 Hacer
		Para j <- 0 Hasta longitud(vocales)-1 Con Paso 1 Hacer
			Si Subcadena(a,i,i)==Subcadena(vocales,j,j) Entonces
				cont <- cont + 1
			FinSi
		FinPara
	FinPara
	Escribir"El texto introducido tiene ", cont, " vocales.";
FinAlgoritmo
