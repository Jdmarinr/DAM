Algoritmo matrizx2
	Dimension m[30]
	Para i<-0 Hasta 29 Hacer	//este bucle lee y guarda 30 valores en la matriz m
		Escribir 'Introduzca un número ',i+1,'.'
		Leer m[i]
	FinPara
	Para i<-0 Hasta 29 Hacer  	//este bucle multiplica por 2 cada valor de la matriz m y muestra 
		m[i] <- m[i]*2			//en el orden introducidos todos los valores ya multiplicados
		Escribir m[i]
	FinPara
FinAlgoritmo

