package br.com.hexarc.adapters.in.controller.mapper;

import br.com.hexarc.adapters.in.controller.dto.in.CreateCustomerInputDTO;
import br.com.hexarc.application.core.domain.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerControllerMapper {
    private ModelMapper modelMapper;

    public Customer toEntity(CreateCustomerInputDTO dto) {
        return modelMapper.map(dto, Customer.class);
    }
}
