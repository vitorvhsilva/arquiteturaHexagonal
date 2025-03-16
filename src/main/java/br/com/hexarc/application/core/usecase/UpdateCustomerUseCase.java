package br.com.hexarc.application.core.usecase;

import br.com.hexarc.application.core.domain.Address;
import br.com.hexarc.application.core.domain.Customer;
import br.com.hexarc.application.ports.in.GetCustomerByIdInputPort;
import br.com.hexarc.application.ports.in.UpdateCustomerInputPort;
import br.com.hexarc.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.hexarc.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private GetCustomerByIdInputPort getCustomerById;
    private FindAddressByZipCodeOutputPort findAddressByZipCode;
    private UpdateCustomerOutputPort updateCustomer;

    public UpdateCustomerUseCase(GetCustomerByIdInputPort getCustomerById, FindAddressByZipCodeOutputPort findAddressByZipCode, UpdateCustomerOutputPort updateCustomer) {
        this.getCustomerById = getCustomerById;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    public Customer update(Customer customer, String zipCode) {
        getCustomerById.get(customer.getId());
        Address address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        return updateCustomer.update(customer);
    }
}
