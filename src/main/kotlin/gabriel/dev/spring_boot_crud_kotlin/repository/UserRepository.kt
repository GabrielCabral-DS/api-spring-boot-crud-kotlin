package gabriel.dev.spring_boot_crud_kotlin.repository

import gabriel.dev.spring_boot_crud_kotlin.domain.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserRepository : JpaRepository<User, UUID> {

}