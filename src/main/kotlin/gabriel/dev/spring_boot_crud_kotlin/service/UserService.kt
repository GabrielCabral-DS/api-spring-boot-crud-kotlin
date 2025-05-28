package gabriel.dev.spring_boot_crud_kotlin.service

import gabriel.dev.spring_boot_crud_kotlin.domain.dto.UserRequest
import gabriel.dev.spring_boot_crud_kotlin.domain.dto.UserResponse
import gabriel.dev.spring_boot_crud_kotlin.domain.dto.toResponse
import gabriel.dev.spring_boot_crud_kotlin.domain.entity.User
import gabriel.dev.spring_boot_crud_kotlin.repository.UserRepository
import gabriel.dev.spring_boot_crud_kotlin.validator.UserValid
import org.springframework.stereotype.Service
import java.util.UUID

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
        UserValid(userRepository).validate(user)
        return userRepository.save(user).toResponse()
    }

    fun getAllUsers(): List<UserResponse> {
        return userRepository.findAll().map { it.toResponse() }
    }

    fun updateUserById(id: UUID, userRequest: UserRequest): UserResponse{
        val user = userRepository.findById(id).orElseThrow {
            throw NoSuchElementException("User with id $id not found")
        }
        user.name = userRequest.name
        user.email = userRequest.email
        user.cpf = userRequest.cpf
        user.password = userRequest.password
        user.phone = userRequest.phone
        user.address = userRequest.address
        user.city = userRequest.city

        UserValid(userRepository).validate(user)
        return userRepository.save(user).toResponse()
    }

    fun deleteUserById(id: UUID){
        userRepository.deleteById(id)
    }



}