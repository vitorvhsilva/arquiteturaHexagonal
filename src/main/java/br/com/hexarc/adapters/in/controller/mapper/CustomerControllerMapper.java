package br.com.hexarc.adapters.in.controller.mapper;

import br.com.hexarc.adapters.in.controller.dto.in.CreateCustomerInputDTO;
import br.com.hexarc.adapters.in.controller.dto.out.CreateCustomerOutputDTO;
import br.com.hexarc.application.core.domain.Customer;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CustomerControllerMapper {
    private ModelMapper modelMapper;

    public Customer createInputToEntity(CreateCustomerInputDTO dto) {
        return modelMapper.map(dto, Customer.class);
    }

    public CreateCustomerOutputDTO entityToCreateOutput(Customer persistedCustomer) {
        return modelMapper.map(persistedCustomer, CreateCustomerOutputDTO.class);
    }
}
