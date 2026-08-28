package cl.duocuc.ari_papeleria

import cl.duocuc.ari_papeleria.model.Producto
import cl.duocuc.ari_papeleria.model.ProductoOficina
import cl.duocuc.ari_papeleria.util.ProductoUtil

fun main() {
	val producto = Producto("Resma de papel", 120)
	val productoOficina = ProductoOficina("Corrector líquido", 40, "Oficina", 1500.0)

	producto.describirse()
	productoOficina.describirse()
	productoOficina.mostrarCategoria()

	val dto = ProductoUtil.convertirADTO(productoOficina)
	println("DTO generado: $dto")

}