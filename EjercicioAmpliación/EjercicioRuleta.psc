Algoritmo ruleta
	Definir n_elementos,num,numAzar Como Entero
	inv <- "Valor inválido."
	 
	Repetir
		Escribir 'Digite la cantidad de casilleros que tendrá la ruleta. Recuerde que tiene que ser un número entre el 16 y el 36, y ha de ser multiplo de 4. ' 
		Leer n_elementos	//Pedimos al usuario que introduzca la cantidad de casilleros que tendrá la ruleta
		Si n_elementos<16 O n_elementos>36 O n_elementos MOD 4!=0 Entonces
			Escribir inv
		FinSi
	Hasta Que n_elementos>=16 Y n_elementos<=36 Y n_elementos MOD 4=0
	
	Repetir
		Escribir 'Ingrese el monto inicial de dinero que posee.'				   //Se pide al usuario el monto inicial
		Leer montoInicial
		Si montoInicial<=0 Entonces
			Escribir inv
		SiNo
			boteRuleta <- montoInicial*100			// La ruleta comienza con 100 veces el monto inicial
			montoActual <- montoInicial
			limite <- montoInicial*50
		FinSi
	Hasta que montoInicial > 0
	
	Repetir
		Repetir
			Escribir 'Introduzca la cantidad a apostar.'
			Leer dineroApostado
			Si dineroApostado <= 0 O dineroApostado > montoActual
				Escribir inv
			FinSi
		Hasta Que dineroApostado>0 Y dineroApostado<=montoActual    //Cantidad de apuesta debe ser mayor que cero y menor que el monto actual 
	
		Repetir
			Escribir 'Introduzca el número a jugar'
			Leer num
			Si num <0 O num > n_elementos Entonces
				Escribir inv
			FinSi
		Hasta Que num>=0 Y num<=n_elementos		// El número introducido debe ser un número entre los de la ruleta
		
		numAzar <- azar(n_elementos+1)
		Escribir 'El número seleccionado por la ruleta fue ',numAzar
		Si numAzar==num Entonces										//La ruleta debe elegir un número al azar 
			ganancia <- dineroApostado*16								// Si el jugador acierta el número gana 16 veces la cantidad apostada
		SiNo
			Si (numAzar MOD 2=0 Y num MOD 2=0 Y num<>0) O (numAzar MOD 2!=0 Y num MOD 2<>0) Entonces
				Escribir 'El jugador ha acertado el color.'		// Cabe la posibilidad de que el jugador acierte el color
				ganancia <- dineroApostado*1.8					// Si acierta el color multiplica por 1.8 el dinero apostado
			SiNo
				ganancia <- -dineroApostado
				Escribir 'El jugador pierde.'
			FinSi
		FinSi
		montoActual <- montoActual+ganancia
		boteRuleta <- boteRuleta-ganancia
		Si ganancia < 0 Entonces
			Escribir 'Jugador -> num apostado ',num,' cantidad: ',dineroApostado,' ganancia: ',0
		SiNo
			Escribir 'Jugador -> num apostado ',num,' cantidad: ',dineroApostado,' ganancia: ',ganancia
		FinSi
		Escribir "El dinero actual de la ruleta es ", boteRuleta
		Escribir "Y el dinero actual del jugador es ", montoActual
		Si montoActual > 0 O montoActual <= limite Entonces
			Escribir "La cantidad límite para ganar es ", limite 
		FinSi
	Hasta Que montoActual = 0 || (montoActual > limite)
	Si montoActual = 0 Entonces
		Escribir "Ha ganado la casa."
	Sino 
		Escribir "Ha ganado el jugador."
	FinSi
FinAlgoritmo

