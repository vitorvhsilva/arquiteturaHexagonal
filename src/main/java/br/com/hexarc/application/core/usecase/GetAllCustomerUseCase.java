package br.com.hexarc.application.core.usecase;

import br.com.hexarc.application.core.domain.Customer;
import br.com.hexarc.application.ports.in.GetAllCustomerInputPort;
import br.com.hexarc.application.ports.out.GetAllCustomerOutputPort;

import java.util.List;

public class GetAllCustomerUseCase implements GetAllCustomerInputPort {

    private GetAllCustomerOutputPort getAllCustomer;

    public GetAllCustomerUseCase(GetAllCustomerOutputPort getAllCustomer) {
        this.getAllCustomer = getAllCustomer;
    }

    @Override
    public List<Customer> getAll() {
        return getAllCustomer.getAll();
    }
}
