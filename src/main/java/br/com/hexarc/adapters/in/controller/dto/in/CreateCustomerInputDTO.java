package br.com.hexarc.adapters.in.controller.dto.in;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateCustomerInputDTO {
    @NotBlank
    private String name;
    @NotBlank
    private String zipCode;
    @NotBlank
    private String cpf;
}
