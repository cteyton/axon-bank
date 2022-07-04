package org.karamelsoft.axon.demo.orchestrators.customer.registration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
internal class CustomerRegistrationApplication {
}

fun main(args: Array<String>) {
    runApplication<CustomerRegistrationApplication>(*args)
}
