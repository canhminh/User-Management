package org.cmn.usermanagement

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class UserManagementApplication

fun main(args: Array<String>) {
    SpringApplication.run(UserManagementApplication::class.java, *args)
}
