package br.com.hexarc.application.core.usecase;

import br.com.hexarc.application.core.domain.Address;
import br.com.hexarc.application.core.domain.Customer;
import br.com.hexarc.application.ports.in.PersistCustomerInputPort;
import br.com.hexarc.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.hexarc.application.ports.out.PersistCustomerOutputPort;
import org.springframework.stereotype.Component;

@Component
public class PersistCustomerUseCase implements PersistCustomerInputPort {

    private FindAddressByZipCodeOutputPort findAddress;
    private PersistCustomerOutputPort persistCostumer;

    public PersistCustomerUseCase(FindAddressByZipCodeOutputPort findAddress, PersistCustomerOutputPort persistCostumer) {
        this.findAddress = findAddress;
        this.persistCostumer = persistCostumer;
    }

    @Override
    public void persist(Customer customer, String zipCode) {
        Address address = findAddress.find(zipCode);
        customer.setAddress(address);
        persistCostumer.persist(customer);
    }
}
