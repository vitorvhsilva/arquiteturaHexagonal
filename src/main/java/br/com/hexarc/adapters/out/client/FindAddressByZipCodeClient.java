package br.com.hexarc.adapters.out.client;

import br.com.hexarc.adapters.out.client.dto.AddressDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${vitorhsilva.client.address.url}")
public interface FindAddressByZipCodeClient {
    @GetMapping("/{zipCode}")
    AddressDTO find(String zipCode);
}
