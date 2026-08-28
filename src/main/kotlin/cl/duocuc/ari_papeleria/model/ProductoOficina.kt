package cl.duocuc.ari_papeleria.model

// ProductoOficina = Empleado (subclase de la guía)
class ProductoOficina(
    nombre: String,
    stock: Int,
    val categoria: String,
    private val precio: Double
) : Producto(nombre, stock) {

    fun mostrarCategoria() {
        println("$nombre pertenece a la categoría $categoria.")
    }

    // Polimorfismo: sobrescribimos describirse()
    override fun describirse() {
        println("Este es $nombre, pertenece a la categoría $categoria y tiene $stock unidades en stock.")
    }

    fun obtenerPrecio(): Double = precio
}