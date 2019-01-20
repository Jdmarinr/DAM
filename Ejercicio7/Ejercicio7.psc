Algoritmo sin_titulo
	Escribir 'Indique los litros de agua consumidos en un mes.'
	Leer litrosGastados		//Lee la cantidad de litros gastados
	gasto <- 30				//Inicializamos gasto en 30, que es el mínimo a pagar
	Si litrosGastados < 0 Entonces		//Si los litros gastados son menores que 0 es un valor erroneo
		Escribir "Este valor es inválido."
	SiNo								//Si los litros gastados no son menores que 0
		Si litrosGastados<=50 Entonces				//Si los litros gastados son menores o iguales que 50
			Escribir 'El gasto es de ',gasto,'€.'	//el gasto es el mínimo (30)
		SiNo
			Si litrosGastados<=200 Entonces		//Si los litros gastados son más que 50 pero menos o igual que 200
				Si ((litrosGastados-50)*2)<=gasto Entonces	//Calcula si el gasto es menor de 30€
					Escribir 'El gasto es de ',gasto,'€.'	//si lo es, el gasto es el mínimo (30€)
				SiNo
					gasto <- ((litrosGastados-50)*2)		//Si el gasto no es menor que 30€, se calcula el gasto
					Escribir 'El gasto es de ',gasto,'€.'	//restando los 50 litros gratuitos y lo multiplic por 2€	
				FinSi
			SiNo
				gasto <- ((litrosGastados-50)*3)		//Si los litros gastados son más de 200, se calcula el gasto
				Escribir 'El gasto es de ',gasto,'€.'	//restando los 50 litros grauitos y lo multiplica por 3€
			FinSi
		FinSi
	FinSi
FinAlgoritmo

