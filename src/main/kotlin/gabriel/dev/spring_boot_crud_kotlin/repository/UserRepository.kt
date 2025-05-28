package gabriel.dev.spring_boot_crud_kotlin.repository

import gabriel.dev.spring_boot_crud_kotlin.domain.entity.User
import org.hibernate.validator.constraints.br.CPF
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional
import java.util.UUID

interface UserRepository : JpaRepository<User, UUID> {
    fun findByEmail(email: String): Optional<User>
    fun findByCpf(cpf: String): Optional<User>
}