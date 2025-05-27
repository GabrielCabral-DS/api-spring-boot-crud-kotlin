package gabriel.dev.spring_boot_crud_kotlin.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    var nameProduct: String = "",
    var price: Double = 0.0,
    var quantity: String = "",
    var description: String = "",
)