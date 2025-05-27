package gabriel.dev.spring_boot_crud_kotlin.domain.dto

import gabriel.dev.spring_boot_crud_kotlin.domain.entity.Product

data class ProductResponse (
    val id: Long,
    val nameProduct: String,
    val price: Double,
    val quantity: String,
    val description: String
)

fun Product.toResponse() = ProductResponse(
    id = this.id,
    nameProduct = this.nameProduct,
    price = this.price,
    quantity = this.quantity,
    description = this.description
)