Algoritmo sin_titulo
	Definir temp,temp_neg Como Real
	i <- 1
	temp_neg <- 0
	Mientras i<=20 Hacer
		Escribir 'Introduzca la temperatura actual'
		Leer temp
		Si temp<0 Entonces
			temp_neg <- temp_neg+1
		FinSi
		i <- i+1
	FinMientras
	Escribir 'El número de veces con temperatura inferior a cero grados ha sido ',temp_neg
FinAlgoritmo

