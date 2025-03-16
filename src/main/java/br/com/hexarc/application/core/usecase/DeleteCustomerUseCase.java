package br.com.hexarc.application.core.usecase;

import br.com.hexarc.application.ports.in.DeleteCustomerInputPort;
import br.com.hexarc.application.ports.out.DeleteCustomerOutputPort;

public class DeleteCustomerUseCase implements DeleteCustomerInputPort {

    private DeleteCustomerOutputPort deleteCustomer;

    public DeleteCustomerUseCase(DeleteCustomerOutputPort deleteCustomer) {
        this.deleteCustomer = deleteCustomer;
    }

    @Override
    public void delete(String id) {
        deleteCustomer.delete(id);
    }
}
