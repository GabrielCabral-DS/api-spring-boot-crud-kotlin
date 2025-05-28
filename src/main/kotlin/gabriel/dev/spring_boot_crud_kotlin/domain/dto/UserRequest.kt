package gabriel.dev.spring_boot_crud_kotlin.domain.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size
import org.hibernate.validator.constraints.br.CPF

data class UserRequest (

    @field:NotBlank(message = "Name cannot be blank")
    val name: String,

    @field:NotBlank(message = "Email cannot be blank")
    @field:Email(message = "Email should be valid")
    val email: String,

    @field:NotBlank(message = "CPF cannot be blank")
    @field:CPF(message = "CPF should be valid")
    val cpf: String,

    @NotBlank(message = "Password cannot be blank")
    @Size(min = 6, max = 20, message = "Password must be between 6 and 20 characters")
    val password: String,

    @field:NotBlank(message = "Phone cannot be blank")
    val phone: String,

    @field:NotBlank(message = "Address cannot be blank")
    val address: String,

    @field:NotBlank(message = "City cannot be blank")
    val city: String
)