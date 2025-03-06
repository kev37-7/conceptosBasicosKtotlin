fun main() {
    // 1. Notificaciones moviles
    // Se crean objetos que instancian la clase Notificaciones con un número de mensajes como parámetro
    Notificaciones(51).mostrarResumen()
    Notificaciones(135).mostrarResumen()

    // 2. Precio de la entrada de cine
    // Se crean objetos que instancian la clase PrecioCine con la edad y si es lunes o no
    PrecioCine(5, true).mostrarPrecio()
    PrecioCine(28, true).mostrarPrecio()
    PrecioCine(87, true).mostrarPrecio()

    // 3. Conversor de temperatura
    // Se crean objetos de la clase ConversorTemperatura
    ConversorTemperatura(27.0, "Celsius", "Fahrenheit") { c -> (9.0 / 5.0) * c + 32 }.imprimirResultado()
    ConversorTemperatura(350.0, "Kelvin", "Celsius") { k -> k - 273.15 }.imprimirResultado()
    ConversorTemperatura(10.0, "Fahrenheit", "Kelvin") { f -> (5.0 / 9.0) * (f - 32) + 273.15 }.imprimirResultado()

    // 4. Perfil de Internet
    // Se crean objetos de la clase PerfilInternet con los datos de nombre, edad, pasatiempo y referente
    val amanda = PerfilInternet("Amanda", 33, "jugar tenis", null)
    val atiqah = PerfilInternet("Atiqah", 28, "escalar", amanda)
    amanda.mostrarPerfil()
    atiqah.mostrarPerfil()

    // 5. Telefonos plegables
    // Se crea un objeto de la clase Telefonos con el estado inicial de plegado
    val telefono = Telefonos(true)
    telefono.desplegar()
    telefono.encender()
    telefono.verificarPantalla()

    // 6. Subasta especial
    // Se crea una oferta con el valor de la oferta y el nombre del ofertante
    val ofertaGanadora = Subasta.Oferta(5000, "Coleccionista Privado")
    println("El artículo A se vende por ${Subasta.precioSubasta(ofertaGanadora, 2000)}.")
    println("El artículo B se vende por ${Subasta.precioSubasta(null, 3000)}.")
}
