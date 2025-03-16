package br.com.hexarc.adapters.out;

import br.com.hexarc.adapters.out.repository.CustomerRepository;
import br.com.hexarc.adapters.out.repository.entity.CustomerEntity;
import br.com.hexarc.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.hexarc.application.core.domain.Customer;
import br.com.hexarc.application.ports.out.GetCustomerByIdOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class GetCustomerByIdAdapter implements GetCustomerByIdOutputPort {

    private CustomerRepository customerRepository;
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> get(String id) {
        Optional<CustomerEntity> customerEntity = customerRepository.findById(id);
        return customerEntity.map(e -> customerEntityMapper.toCustomer(e));
    }
}
