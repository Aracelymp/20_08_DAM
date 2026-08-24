fun main() {
    var nombreCliente: String? = "Dayan"
    // en este caso si es null nos mostraria "cliente generico"

    println("Bienvenido/a, ${nombreCliente ?: "Cliente Genérico"}")

    nombreCliente = null

    println("Bienvenido/a, ${nombreCliente ?: "Cliente Genérico"}")

    val codigoPago = 3
    val porcentajeDescuento: Int =
            when (codigoPago) {
                1 -> 15 // para el 15% de dcto
                2 -> 5 // para el 5% de dcto
                3 -> 0 // sin dcto
                else -> {
                    println("Advertencia: código de pago inválido")
                    0
                }
            }

    println("Porcentaje de descuento aplicado: $porcentajeDescuento%")

    var totalCompra = 0.0

    for (i in 1..3) {
        val precioProducto = i * 2500
        totalCompra += precioProducto
        println("Producto $i escaneado, precio: $precioProducto")
    }

    println("Total sin descuentos: $totalCompra")

    while (totalCompra < 0) {
        println("Monto inválido detectado")
        totalCompra = 0.0
    }

    val totalConDescuento = calcularTotalConDescuento(totalCompra, porcentajeDescuento)

    println("Total con descuento aplicado: $totalConDescuento")

    val iva = calcularIva(totalConDescuento)

    println("IVA (19%): $iva")

    val totalConPromocion =
            aplicarPromocion(totalConDescuento) { monto ->
                Math.ceil(monto)
            } // Math ceil redondea decimal hacia arriba

    println("Total con promoción (redondeo): $totalConPromocion")

    val totalFinal = totalConPromocion + iva

    println("TOTAL FINAL A PAGAR: $totalFinal")
}

fun calcularTotalConDescuento(subtotal: Double, porcentajeDescuento: Int): Double {
    val montoDescuento = subtotal * (porcentajeDescuento / 100.0)
    return subtotal - montoDescuento
}

fun calcularIva(total: Double): Double = total * 0.19

fun aplicarPromocion(subtotal: Double, operacion: (Double) -> Double): Double {
    println("Aplicando promoción personalizada...")
    return operacion(subtotal)
}