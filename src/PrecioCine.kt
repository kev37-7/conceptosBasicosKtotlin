//se crea la clase PrecioCine con sus respectivos paramentros
class PrecioCine(val edad: Int, val esLunes: Boolean) {
    //Calcula y muestra el precio segun los parametros
    fun mostrarPrecio() {
        //se utiliza when que es como un swith para realizarse una accion segun lo que se cumpla
        val precio = when {
            edad in 0..12 -> 15
            edad in 13..60 -> if (esLunes) 25 else 30
            edad in 61..100 -> 20
            else -> -1
        }
        //muestra el mensaje
        println("El precio de la entrada para una persona de $edad años es \$$precio.")
    }
}