package br.com.hexarc.adapters.out;

import br.com.hexarc.adapters.out.repository.CustomerRepository;
import br.com.hexarc.application.ports.out.DeleteCustomerOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DeleteCustomerAdapter implements DeleteCustomerOutputPort {

    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
