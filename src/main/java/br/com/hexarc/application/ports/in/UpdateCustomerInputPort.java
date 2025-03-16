package br.com.hexarc.application.ports.in;

import br.com.hexarc.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    Customer update(Customer customer, String zipCode);
}
