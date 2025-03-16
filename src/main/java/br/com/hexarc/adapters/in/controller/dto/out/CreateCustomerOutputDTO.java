package br.com.hexarc.adapters.in.controller.dto.out;

import br.com.hexarc.application.core.domain.Address;
import lombok.Data;

@Data
public class CreateCustomerOutputDTO {
    private String id;
    private String name;
    private Address address;
    private String cpf;
    private Boolean isValidCpf;
}
