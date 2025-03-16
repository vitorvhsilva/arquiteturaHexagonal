package br.com.hexarc.application.ports.out;

import br.com.hexarc.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
