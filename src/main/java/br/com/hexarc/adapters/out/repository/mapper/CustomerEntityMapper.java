package br.com.hexarc.adapters.out.repository.mapper;

import br.com.hexarc.adapters.out.repository.entity.CustomerEntity;
import br.com.hexarc.application.core.domain.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerEntityMapper {
    private ModelMapper modelMapper;

    public CustomerEntity toEntity(Customer customer) {
        return modelMapper.map(customer, CustomerEntity.class);
    }

    public Customer toCustomer(CustomerEntity customer) {
        return modelMapper.map(customer, Customer.class);
    }
}
