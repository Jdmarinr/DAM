Algoritmo sin_titulo
	Escribir 'Digite un número'
	Leer a
	Escribir 'Digite un número'
	Leer b
	Escribir 'Digite un número'
	Leer c
	Si a >= b Entonces
		Si a >= c Entonces
			Escribir "El mayor de los tres números es ", a;
		SiNo
			Escribir "El mayor de los tres números es ", c;
		FinSi
	SiNo
		Si b >= c Entonces
			Escribir "El mayor de los tres números es ", b;
		SiNo
			Escribir "El mayor de los tres números es ", c;
		FinSi
	FinSi
FinAlgoritmo

