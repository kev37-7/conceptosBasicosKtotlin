//se crea esta clase para representar un telefono si plegado o pantalla encendida
class Telefonos(var estaPlegado: Boolean, var estaPantallaEncendida: Boolean = false) {
    //metodo que enciende la pantalla, por defento inicia apagada
    open fun encender() { //se usa open para permitir que esta funcion pueda ser sobreescrita en una clase hija
        if (!estaPlegado) {
            estaPantallaEncendida = true
        }
    }

    //metodo para apagar la pantalla
    fun apagar() {
        estaPantallaEncendida = false
    }

    //muestra el estado de la pantalla
    fun verificarPantalla() {
        val estado = if (estaPantallaEncendida) "encendida" else "apagada"
        println("La luz de la pantalla está $estado.")
    }

    //cambia el estadod e la pantalla al desplegar
    fun desplegar() {
        estaPlegado = false
    }
}