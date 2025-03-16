package br.com.hexarc.adapters.in.controller;

import br.com.hexarc.adapters.in.controller.dto.in.CreateCustomerInputDTO;
import br.com.hexarc.adapters.in.controller.mapper.CustomerControllerMapper;
import br.com.hexarc.application.core.domain.Customer;
import br.com.hexarc.application.ports.in.PersistCustomerInputPort;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("costumers")
@AllArgsConstructor
public class CustomerController {

    private PersistCustomerInputPort persistCustomer;
    private CustomerControllerMapper controllerMapper;

    @PostMapping
    public ResponseEntity<Void> persist(@Valid @RequestBody CreateCustomerInputDTO dto){
        Customer customer = controllerMapper.toEntity(dto);
        persistCustomer.persist(customer, dto.getZipCode());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
