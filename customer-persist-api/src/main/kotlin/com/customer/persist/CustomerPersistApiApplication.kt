package com.customer.persist

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CustomerPersistApiApplication

fun main(args: Array<String>) {
	runApplication<CustomerPersistApiApplication>(*args)
}
