Algoritmo sin_titulo
	Leer a,b,c
	laMovidaEsta <- (b^2)-4*a*c
	Si laMovidaEsta<0 Entonces
		Escribir 'Algo no va bien bruh. No hay solución real.'
	SiNo
		resultado1 <- (-b+(RC(laMovidaEsta)/2*a))
		resultado2 <- (-b-(RC(laMovidaEsta)/2*a))
		Escribir 'Los resultados son ',resultado1,' y ',resultado2
	FinSi
FinAlgoritmo

