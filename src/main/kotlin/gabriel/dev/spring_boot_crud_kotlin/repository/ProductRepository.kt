package gabriel.dev.spring_boot_crud_kotlin.repository

import gabriel.dev.spring_boot_crud_kotlin.domain.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, Integer> {

}