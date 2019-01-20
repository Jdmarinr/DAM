Algoritmo sin_titulo
	notaSuma <- 0		//Inicializamos las variables con las que vamos a operar							
	notaMayor <- 0
	notaMenor <- 10		
	cont <- 0			//Inicializamos un contador para saber cuantos alumnos se han presentado
	a <- 0				//Inicializamos la variable a en 0 para que siempre entre en el bucle
	Mientras a=0 Hacer	//Mientras la variable a sea igual a 0 entra en el bucle
		Escribir "Introduce la nota de un alumno."
		Leer nota
		Si nota >= 0 Y nota <=10 Entonces	//Solo es una nota válida si está entre 0 y 10
			notaSuma <- notaSuma+nota		//Suma la nota que acaba de leer y la acumula en notaSuma
			cont <- cont+1					//Suma 1 al contador por cada vez que lee una nota entre 0 y 10
			Si nota>notaMayor Entonces		//Si la nota leida es mayor que la actual notaMayor, se actualiza su valor a la nota leida
				notaMayor <- nota
			FinSi
			Si nota<notaMenor Entonces		//Si la nota leida es menor que la actual notaMenor, se actualiza su valor a la nota leida
				notaMenor <- nota
			FinSi
		SiNo	//Si la nota leida no está entre 0 y 10
			Si nota < 0	//Si la nota es menor que 0 cambia el valor de "a" a 1 para que salga del bucle
				a <- 1
			SiNo	//Si la nota es mayor de 10 indicamos que no es válida y que vuelva a introducir una nota
				Escribir "No es una nota válida."
			FinSi
		FinSi
	FinMientras
	Escribir 'La media es ',notaSuma/cont
	Escribir 'La nota más alta es ',notaMayor
	Escribir 'La nota más baja es ',notaMenor
	Escribir 'El número de alumnos presentados es ',cont
FinAlgoritmo

