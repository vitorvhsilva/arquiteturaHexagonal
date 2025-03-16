package br.com.hexarc.adapters.out;

import br.com.hexarc.adapters.in.controller.dto.in.UpdateCustomerInputDTO;
import br.com.hexarc.adapters.out.repository.CustomerRepository;
import br.com.hexarc.adapters.out.repository.entity.CustomerEntity;
import br.com.hexarc.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.hexarc.application.core.domain.Customer;
import br.com.hexarc.application.ports.out.UpdateCustomerOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@AllArgsConstructor
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    private CustomerRepository customerRepository;
    private CustomerEntityMapper customerEntityMapper;

    @Override
    @Transactional
    public Customer update(Customer updatedCustomer) {
        CustomerEntity entity = customerRepository.findById(updatedCustomer.getId())
                .orElseThrow(() -> new RuntimeException("Costumer not found!"));
        entity.setName(updatedCustomer.getName());
        entity.setCpf(updatedCustomer.getCpf());
        return customerEntityMapper.toCustomer(entity);
    }
}
