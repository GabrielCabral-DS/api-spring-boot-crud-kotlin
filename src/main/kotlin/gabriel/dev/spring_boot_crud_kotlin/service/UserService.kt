package gabriel.dev.spring_boot_crud_kotlin.service

import gabriel.dev.spring_boot_crud_kotlin.domain.dto.UserRequest
import gabriel.dev.spring_boot_crud_kotlin.domain.dto.UserResponse
import gabriel.dev.spring_boot_crud_kotlin.domain.dto.toResponse
import gabriel.dev.spring_boot_crud_kotlin.domain.entity.User
import gabriel.dev.spring_boot_crud_kotlin.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (private val userRepository: UserRepository) {

    fun saveUser(userRequest: UserRequest): UserResponse {
        val user = User(
            name = userRequest.name,
            email = userRequest.email,
            cpf = userRequest.cpf,
            password = userRequest.password,
            phone = userRequest.phone,
            address = userRequest.address,
            city = userRequest.city
        )

        return userRepository.save(user).toResponse()
    }

    fun getAllUsers(): List<UserResponse> {
        return userRepository.findAll().map { it.toResponse() }
    }



}