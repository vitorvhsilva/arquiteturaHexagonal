package br.com.hexarc.application.ports.out;

import br.com.hexarc.application.core.domain.Customer;

import java.util.Optional;

public interface GetCustomerByIdOutputPort {
    Optional<Customer> get(String id);
}
