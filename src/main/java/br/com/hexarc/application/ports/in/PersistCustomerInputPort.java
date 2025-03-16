package br.com.hexarc.application.ports.in;

import br.com.hexarc.application.core.domain.Customer;

public interface PersistCustomerInputPort {
    Customer persist(Customer customer, String zipCode);
}
