Algoritmo sin_titulo
	Definir promedio Como Real
	Escribir 'Introduzca la nota obtenida en el primer examen.'
	Leer num1
	Escribir 'Introduzca la nota obtenida en el segundo examen.'
	Leer num2
	Escribir 'Introduzca la nota obtenida en el tercer examen.'
	Leer num3
	Si (num1>=0 Y num1<=10) Y (num2>=0 Y num2<=10) Y (num3>=0 Y num3<=10) Entonces
		num1 <- num1*0.5
		num2 <- num2*0.2
		num3 <- num3*0.3
	SiNo
		Escribir 'Nota inválida. Introduzca un número entre 0 y 10.'
	FinSi
	promedio <- (num1+num2+num3)
	Escribir 'La nota de media de los 3 exámenes es: ',promedio
FinAlgoritmo

