Algoritmo sin_titulo
	Escribir 'Introduce un a�o para saber si es o no es bisiesto: '
	Definir a�o Como Entero
	Leer a�o
	Si a�o MOD 4=0 Y ((a�o MOD 100!=0) O (a�o MOD 400=0)) Entonces
		Escribir 'El a�o introducido es bisiesto'
	SiNo
		Escribir 'Este no es un a�o bisiesto'
	FinSi
FinAlgoritmo

