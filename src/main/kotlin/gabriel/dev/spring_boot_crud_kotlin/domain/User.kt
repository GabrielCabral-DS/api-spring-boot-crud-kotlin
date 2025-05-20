package gabriel.dev.spring_boot_crud_kotlin.domain

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
    val name: String = "",
    val email: String = "",
    val cpf: String = "",
    val password: String = "",
    val phone: String = "",
    val address: String = "",
    val city: String = "",
) {

}