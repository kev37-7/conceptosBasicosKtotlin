//Se define la clase notificaciones con el parametro establecido de numeroMensaje
class Notificaciones(val numeroMensajes: Int) {
    //Muestra un mensaje con el numero de notificaciones
    fun mostrarResumen() {
        //Se evalua una condicion
        if (numeroMensajes < 100) {//si el numero es mayor a 100, se ejecuta este bloque
            println("Tienes $numeroMensajes notificaciones.")
        } else {//por el contraio si es menor, se ejecuta este bloque
            println("¡Tu teléfono está explotando! Tienes 99+ notificaciones.")
        }
    }
}
