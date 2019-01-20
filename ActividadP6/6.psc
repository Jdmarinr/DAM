Algoritmo sin_titulo
	Escribir 'Introduce la temperatura'
	Leer t
	Escribir 'Si la temperatura introducida está en Fahrenheit escribe 1, si está en Celsius escribe 2'
	Leer a
	Si a=1 Entonces
		tFinal <- (t-32)*(5/9)
		Escribir 'La temperatura en Celsius es ',tFinal
	SiNo
		Si a=2 Entonces
		tFinal <- (t+32)*(9/5)
		Escribir 'La temperatura en Fahrenheit es ',tFinal
		SiNo
			Escribir "El valor introducido es erroneo, reinicie el programa."
		FinSi
	FinSi
FinAlgoritmo

