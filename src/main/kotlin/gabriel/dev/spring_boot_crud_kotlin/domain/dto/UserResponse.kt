package gabriel.dev.spring_boot_crud_kotlin.domain.dto

import gabriel.dev.spring_boot_crud_kotlin.domain.entity.User
import java.util.UUID

data class UserResponse (
    val id: UUID,
    val name: String,
    val email: String,
    val cpf: String,
    val password: String,
    val phone: String,
    val address: String,
    val city: String
)
fun User.toResponse() = UserResponse(
    id = this.id ?: UUID.randomUUID(),
    name = this.name,
    email = this.email,
    cpf = this.cpf,
    password = this.password,
    phone = this.phone,
    address = this.address,
    city = this.city
)
