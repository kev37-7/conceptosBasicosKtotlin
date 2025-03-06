//se crea  la clase y se crean unas variables de unidad de medida
class ConversorTemperatura(
    val medidaInicial: Double,
    val unidadInicial: String,
    val unidadFinal: String,
    val formulaConversion: (Double) -> Double
) {
    //Muestra el resultado de la conversion de valores
    fun imprimirResultado() {
        val medidaFinal = String.format("%.2f", formulaConversion(medidaInicial))
        println("$medidaInicial grados $unidadInicial son $medidaFinal grados $unidadFinal.")
    }
}