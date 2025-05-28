package gabriel.dev.spring_boot_crud_kotlin.domain.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class ProductRequest (

    @field:NotBlank(message = "Name of the product is required")
    val nameProduct: String,

    @field:NotBlank(message = "Price of the product is required")
    val price: Double,

    @field:NotBlank(message = "Quantity of the product is required")
    @field:Size(min = 1, max = 10, message = "Quantity must be between 1 and 10 characters")
    val quantity: String,

    @field:NotBlank(message = "Description of the product is required")
    val description: String

)