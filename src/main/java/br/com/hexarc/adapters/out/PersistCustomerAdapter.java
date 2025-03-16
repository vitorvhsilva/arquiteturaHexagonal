package br.com.hexarc.adapters.out;

import br.com.hexarc.adapters.out.repository.CustomerRepository;
import br.com.hexarc.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.hexarc.application.core.domain.Customer;
import br.com.hexarc.application.ports.out.PersistCustomerOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PersistCustomerAdapter implements PersistCustomerOutputPort {

    private CustomerRepository customerRepository;
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void persist(Customer customer) {
        customerRepository.save(customerEntityMapper.toEntity(customer));
    }
}
