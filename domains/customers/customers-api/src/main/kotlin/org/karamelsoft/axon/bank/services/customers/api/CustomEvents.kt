package org.karamelsoft.axon.bank.services.customers.api

import java.time.Instant

sealed interface CustomerEvent {
    val customerId: CustomerId
    val timestamp: Instant
}

data class NewCustomerRegistered(
    override val customerId: CustomerId,
    val details: CustomerDetails,
    val address: CustomerAddress,
    override val timestamp: Instant
): CustomerEvent

data class CustomerUpdated(
    override val customerId: CustomerId,
    val details: CustomerDetails,
    val address: CustomerAddress,
    override val timestamp: Instant
): CustomerEvent
