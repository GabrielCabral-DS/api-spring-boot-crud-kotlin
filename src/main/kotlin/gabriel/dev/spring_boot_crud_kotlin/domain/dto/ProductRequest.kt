package gabriel.dev.spring_boot_crud_kotlin.domain.dto

data class ProductRequest (

    val nameProduct: String,
    val price: Double,
    val quantity: String,
    val description: String

)