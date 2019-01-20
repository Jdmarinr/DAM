Algoritmo sin_titulo
	Escribir 'Introduce un año para saber si es o no es bisiesto: '
	Definir año Como Entero
	Leer año
	Si año MOD 4=0 Y ((año MOD 100!=0) O (año MOD 400=0)) Entonces
		Escribir 'El año introducido es bisiesto'
	SiNo
		Escribir 'Este no es un año bisiesto'
	FinSi
FinAlgoritmo

