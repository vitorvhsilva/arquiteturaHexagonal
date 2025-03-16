package br.com.hexarc.adapters.out;

import br.com.hexarc.adapters.out.repository.CustomerRepository;
import br.com.hexarc.adapters.out.repository.entity.CustomerEntity;
import br.com.hexarc.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.hexarc.application.core.domain.Customer;
import br.com.hexarc.application.ports.out.GetAllCustomerOutputPort;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
@AllArgsConstructor
public class GetAllCostumerAdapter implements GetAllCustomerOutputPort {
    private CustomerRepository customerRepository;
    private CustomerEntityMapper entityMapper;

    @Override
    public List<Customer> getAll() {
        List<CustomerEntity> entities = customerRepository.findAll();
        return entities.stream()
                .map(e -> entityMapper.toCustomer(e))
                .toList();
    }
}
