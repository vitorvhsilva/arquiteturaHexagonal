package br.com.hexarc.adapters.out.client.mapper;

import br.com.hexarc.adapters.out.client.dto.AddressDTO;
import br.com.hexarc.application.core.domain.Address;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AddressMapper {
    private ModelMapper modelMapper;

    public Address toEntity(AddressDTO dto) {
        return modelMapper.map(dto, Address.class);
    }
}
