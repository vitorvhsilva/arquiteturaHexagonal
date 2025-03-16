package br.com.hexarc.application.core.usecase;

import br.com.hexarc.application.core.domain.Customer;
import br.com.hexarc.application.ports.in.GetCustomerByIdInputPort;
import br.com.hexarc.application.ports.out.GetCustomerByIdOutputPort;

public class GetCustomerByIdUseCase implements GetCustomerByIdInputPort {

    private GetCustomerByIdOutputPort getCustomerById;

    public GetCustomerByIdUseCase(GetCustomerByIdOutputPort getCustomerById) {
        this.getCustomerById = getCustomerById;
    }

    @Override
    public Customer get(String id) {
        return getCustomerById.get(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
