package br.com.hexarc.adapters.in.controller.dto.in;

import lombok.Data;

@Data
public class UpdateCustomerInputDTO {
    private String id;
    private String name;
    private String zipCode;
    private String cpf;
}
