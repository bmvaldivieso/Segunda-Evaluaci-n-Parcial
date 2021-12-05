def formula (n : Int, x : Double) : Double = x - ((Math.pow(x, 2) - n) / (2 * x))

val a = 10 //Numero al cual se le va a calcular la raiz cuadrada
var b = 1.0 //Punto de partida en la recta
val c = 6 //Numero de interacciones de la operacion6

//Interacciones
val x2 = formula(a,b)
val x3 = formula(a,x2)
val x4 = formula(a,x3)
val x5 = formula(a,x4)
val x6 = formula(a,x5)

//Interacciones simplificado
(a > 0)match {
  case true => (1 to c).foreach( e => (if(e != c) b = formula(a,b)else println(b)))
  case false => println("No es un numero entero positivo mayor que cero")
}

