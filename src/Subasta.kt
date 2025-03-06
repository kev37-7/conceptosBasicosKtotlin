class Subasta {
    //esta clase anidada represetna una oferta en la subasta
    class Oferta(val cantidad: Int, val ofertante: String)//representa el monto y el ofertante

    //este bloque permite crear metodos que se pueden llamar sin necesidad de crear instancias
    companion object {
        //calcula el precio final de la subasta
        fun precioSubasta(oferta: Oferta?, precioMinimo: Int): Int {
            return oferta?.cantidad ?: precioMinimo
        }
    }
}