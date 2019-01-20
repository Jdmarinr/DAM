Algoritmo sin_titulo
	Definir letra Como Caracter			//Define la variable letra como un caracter	
	Escribir "Introduzca una letra."
	Leer letra							//Introduce una letra por teclado
	Segun letra Hacer					//Según la letra que se introduzca
		"L" O "l":						//Si es L o l escribimos Lunes
			Escribir "Lunes."
		"M" O "m":						//Si es M o m escribimos Martes
			Escribir "Martes."
		"X" O "x":						//Si es X o x escribimos Miercoles
			Escribir "Miércoles."
		"J" O "j":						//Si es J o j escribimos Jueves
			Escribir "Jueves."		
		"V" O "v":						//Si es V o v escribimos Viernes
			Escribir "Viernes."		
		"S" O "s":						//Si es S o s escribimos Sabado
			Escribir "Sábado."
		"D" O "d":						//Si es D o d escribimos Domingo
			Escribir "Domingo."
		De Otro Modo:					//Si la letra introducida es diferente a cualquiera de las anteriores indica que no es válida
			Escribir "Esta letra no corresponde a ningún día de la semana o no es una letra."
	Fin Segun
FinAlgoritmo
