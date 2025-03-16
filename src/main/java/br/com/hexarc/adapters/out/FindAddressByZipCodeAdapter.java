package br.com.hexarc.adapters.out;

import br.com.hexarc.adapters.out.client.FindAddressByZipCodeClient;
import br.com.hexarc.adapters.out.client.dto.AddressDTO;
import br.com.hexarc.adapters.out.client.mapper.AddressMapper;
import br.com.hexarc.application.core.domain.Address;
import br.com.hexarc.application.ports.out.FindAddressByZipCodeOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    private FindAddressByZipCodeClient findAddressClient;
    private AddressMapper addressMapper;

    @Override
    public Address find(String zipCode) {
        AddressDTO dto = findAddressClient.find(zipCode);
        return addressMapper.toEntity(dto);
    }
}
