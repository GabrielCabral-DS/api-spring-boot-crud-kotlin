package gabriel.dev.spring_boot_crud_kotlin.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Integer? = null,
    val nameProduct: String = "",
    val price: Double = 0.0,
    val quantity: String = "",
    val description: String = "",
) {





}