package br.com.hexarc.application.core.usecase;

import br.com.hexarc.application.core.domain.Customer;
import br.com.hexarc.application.ports.in.GetAllCustomerInputPort;
import br.com.hexarc.application.ports.out.GetAllCustomerOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class GetAllCustomerUseCase implements GetAllCustomerInputPort {

    private GetAllCustomerOutputPort getAllCustomer;

    @Override
    public List<Customer> getAll() {
        return getAllCustomer.getAll();
    }
}
