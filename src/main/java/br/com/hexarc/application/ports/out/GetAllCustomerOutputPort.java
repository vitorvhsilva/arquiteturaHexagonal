package br.com.hexarc.application.ports.out;

import br.com.hexarc.application.core.domain.Customer;

import java.util.List;

public interface GetAllCustomerOutputPort {
    List<Customer> getAll();
}
