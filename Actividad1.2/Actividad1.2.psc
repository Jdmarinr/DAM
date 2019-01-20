//este es un programa para multiplicar 2 números positivos
//unicamente mediante la operacion de suma

Algoritmo multiplicacion
	Escribir "Ingrese el primer numero"
	Leer a
	Escribir "Ingrese el segundo numero"
	Leer b
	c<-a								//asignamos el valor de a a la variable c
	d<-b								//creamos un contador d y le asignamos el valor de b
	Si b = 0 Entonces					//si b es igual a 0 el resultado será 0
		c = 0
	SiNo								//si b no es igual a 0
		Mientras d > 1 Hacer			//sumamos a a la variable c y lo guardamos en c 
			c = c + a					//le restamos uno a la variable d 
			d = d - 1					//y repetimos mientras d sea mayor que 1
		Fin Mientras
	Fin Si
	Escribir "El resultado es ", c		//devuelve el resultado de la variable c
FinAlgoritmo
