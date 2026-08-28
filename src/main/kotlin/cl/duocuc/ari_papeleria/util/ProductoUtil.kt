package cl.duocuc.ari_papeleria.util

import cl.duocuc.ari_papeleria.model.ProductoOficina
import cl.duocuc.ari_papeleria.dto.ProductoOficinaDTO

object ProductoUtil {

    fun aFormatoCLP(monto: Double): String {
        return "$" + "%,.0f".format(monto).replace(",", ".")
    }

    fun convertirADTO(producto: ProductoOficina): ProductoOficinaDTO {
        return ProductoOficinaDTO(
            nombre = producto.nombre,
            categoria = producto.categoria,
            precioFormateado = aFormatoCLP(producto.obtenerPrecio())
        )
    }
}