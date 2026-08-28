package cl.duocuc.ari_papeleria.model


open class Producto(val nombre: String, val stock: Int) {

    open fun describirse() {
        println("Este es el producto $nombre.")
    }
}