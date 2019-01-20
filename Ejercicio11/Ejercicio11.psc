Algoritmo aAleatorios
	Dimension v[100]			//Creamos un vector de capacidad 100
	cont <- 0					//Inicializamos un contador a 0
	Repetir
		Escribir "Introduzca un número del 0 al 100."
		Leer a
		Si a < 0 O a > 100 Entonces		//Si el número introducido no está en el rango, se pide de nuevo
			Escribir "El número es inválido."
		FinSi
	Hasta Que a >= 0 Y a <= 100

	Para i<-0 Hasta 99 Con Paso 1 Hacer
		v[i] <- azar(101)		//Rellena el vector con valores aleatorios entre el 0 y el 100 
		Si a == v[i] Entonces	//Si el número introducido aparece en el vector se suma 1 al 			
			cont <- cont + 1	//contador cada vez que aparezca
		FinSi
	FinPara
	Escribir "El número introducido aparece ", cont, " veces."
FinAlgoritmo
