package gabriel.dev.spring_boot_crud_kotlin.validator

import gabriel.dev.spring_boot_crud_kotlin.domain.entity.User
import gabriel.dev.spring_boot_crud_kotlin.exception.RegisterDuplicatedException
import gabriel.dev.spring_boot_crud_kotlin.repository.UserRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class UserValid (private val userRepository: UserRepository){

    fun validate(users: User) {
        if (thereIsARegistered(users)) {
            throw RegisterDuplicatedException("User already registered")
        }
    }

    private fun thereIsARegistered(users: User): Boolean {
        val usersOptional: Optional<User> = userRepository.findByCpf(users.cpf)
        val optionalUsers: Optional<User> = userRepository.findByEmail(users.email)

        if (users.id == null) {
            return usersOptional.isPresent || optionalUsers.isPresent
        }

        return users.id!! != usersOptional.get().id && usersOptional.isPresent ||
                users.id!! != optionalUsers.get().id && optionalUsers.isPresent
    }

}