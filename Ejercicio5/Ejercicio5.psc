Algoritmo sin_titulo
	Escribir 'Introduzca un mes en digitos'
	Leer mes		//Introduce el n�mero de un mes por teclado
	Si mes=1 O mes=3 O mes=5 O mes=7 O mes=8 O mes=10 O mes=12 Entonces 
		Escribir 'Este mes tiene 31 d�as.' 		//Si el mes es alguno de estos, devolvemos 31 d�as
	SiNo
		Si mes=2 Entonces						//Si el mes es el 2, devolvemos 28 d�as
			Escribir 'Este mes tiene 28 d�as.'
		SiNo									//Si no es ninguno de los anteriores, devolvemos 30 d�as
			Escribir 'Este mes tiene 30 d�as.'
		FinSi
	FinSi
FinAlgoritmo

