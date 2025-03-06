//se crea esta clase que hace de perfil de una persona en internet
class PerfilInternet(val nombre: String, val edad: Int, val pasatiempo: String?, val referente: PerfilInternet?) {
    //Muestra toda la informacion del perfil
    fun mostrarPerfil() {
        println("Nombre: $nombre")
        println("Edad: $edad")
        println("Le gusta $pasatiempo.")
        //Se usa este condicional para definir si el usuario tiene algun referente
        if (referente != null) {
            println("Tiene como referente a ${referente.nombre}, a quien le gusta ${referente.pasatiempo}.")
        } else {
            println("No tiene referente.")
        }
    }
}