package br.com.hexarc.application.ports.in;

import br.com.hexarc.application.core.domain.Customer;

public interface PersistCustomerInputPort {
    void persist(Customer customer, String zipCode);
}
