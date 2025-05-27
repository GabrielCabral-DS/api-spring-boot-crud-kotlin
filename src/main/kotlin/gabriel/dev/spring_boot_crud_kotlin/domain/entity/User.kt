package gabriel.dev.spring_boot_crud_kotlin.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.UUID

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id : UUID? = null,
    var name: String = "",
    var email: String = "",
    var cpf: String = "",
    var password: String = "",
    var phone: String = "",
    var address: String = "",
    var city: String = "",
)