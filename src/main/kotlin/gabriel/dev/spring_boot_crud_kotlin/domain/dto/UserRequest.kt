package gabriel.dev.spring_boot_crud_kotlin.domain.dto

data class UserRequest (
    val name: String,
    val email: String,
    val cpf: String,
    val password: String,
    val phone: String,
    val address: String,
    val city: String
)