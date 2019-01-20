Algoritmo sin_titulo
	Escribir 'Introducir un número en segundos'
	Leer num
	h <- TRUNC(num/3600)
	m <- TRUNC((num-(h*3600))/60)
	s <- num-h*3600-m*60
	Escribir 'El número introducido son ',h,' horas, ',m,' minutos y ',s,' segundos.'
FinAlgoritmo

