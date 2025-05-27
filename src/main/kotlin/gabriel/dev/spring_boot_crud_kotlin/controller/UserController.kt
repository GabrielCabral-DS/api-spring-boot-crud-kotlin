package gabriel.dev.spring_boot_crud_kotlin.controller

import gabriel.dev.spring_boot_crud_kotlin.domain.dto.UserRequest
import gabriel.dev.spring_boot_crud_kotlin.domain.dto.UserResponse
import gabriel.dev.spring_boot_crud_kotlin.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController (private val userService: UserService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun saveUser(@RequestBody userRequest: UserRequest): UserResponse {
        return userService.saveUser(userRequest)
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAllUsers() = userService.getAllUsers()

}