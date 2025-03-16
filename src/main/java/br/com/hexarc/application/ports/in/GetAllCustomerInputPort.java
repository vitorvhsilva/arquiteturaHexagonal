package br.com.hexarc.application.ports.in;

import br.com.hexarc.application.core.domain.Customer;

import java.util.List;

public interface GetAllCustomerInputPort {
    List<Customer> getAll();
}
