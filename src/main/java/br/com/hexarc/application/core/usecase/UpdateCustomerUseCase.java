package br.com.hexarc.application.core.usecase;

import br.com.hexarc.adapters.in.controller.dto.in.UpdateCustomerInputDTO;
import br.com.hexarc.application.core.domain.Customer;
import br.com.hexarc.application.ports.in.GetCustomerByIdInputPort;
import br.com.hexarc.application.ports.in.UpdateCustomerInputPort;
import br.com.hexarc.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private GetCustomerByIdInputPort getCustomerById;
    private UpdateCustomerOutputPort updateCustomer;

    public Customer update(UpdateCustomerInputDTO dto) {
        getCustomerById.get(dto.getId());
        return updateCustomer.update(dto);
    }
}
