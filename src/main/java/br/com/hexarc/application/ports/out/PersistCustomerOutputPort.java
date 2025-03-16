package br.com.hexarc.application.ports.out;

import br.com.hexarc.application.core.domain.Customer;

public interface PersistCustomerOutputPort {
    void persist(Customer customer);
}
