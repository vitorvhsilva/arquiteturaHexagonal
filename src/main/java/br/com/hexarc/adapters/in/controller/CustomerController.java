package br.com.hexarc.adapters.in.controller;

import br.com.hexarc.adapters.in.controller.dto.in.CreateCustomerInputDTO;
import br.com.hexarc.adapters.in.controller.dto.in.UpdateCustomerInputDTO;
import br.com.hexarc.adapters.in.controller.dto.out.CreateCustomerOutputDTO;
import br.com.hexarc.adapters.in.controller.dto.out.GetCustomerOutputDTO;
import br.com.hexarc.adapters.in.controller.mapper.CustomerControllerMapper;
import br.com.hexarc.application.core.domain.Customer;
import br.com.hexarc.application.ports.in.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("costumers")
@AllArgsConstructor
public class CustomerController {

    private PersistCustomerInputPort persistCustomer;
    private GetCustomerByIdInputPort getCustomerById;
    private GetAllCustomerInputPort getAllCustomer;
    private UpdateCustomerInputPort updateCustomer;
    private DeleteCustomerInputPort deleteCustomer;
    private CustomerControllerMapper controllerMapper;

    @PostMapping
    public ResponseEntity<CreateCustomerOutputDTO> persist(@Valid @RequestBody CreateCustomerInputDTO dto){
        Customer customer = controllerMapper.createInputToEntity(dto);
        Customer persistedCustomer = persistCustomer.persist(customer, dto.getZipCode());
        return ResponseEntity.status(HttpStatus.CREATED).body(controllerMapper.entityToCreateOutput(persistedCustomer));
    }

    @GetMapping()
    public List<GetCustomerOutputDTO> getAll(){
        List<Customer> customers = getAllCustomer.getAll();
        return customers.stream()
                .map(c -> controllerMapper.entityToGetCustomer(c))
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetCustomerOutputDTO> get(@RequestParam String id){
        Customer customer = getCustomerById.get(id);
        GetCustomerOutputDTO getCustomer = controllerMapper.entityToGetCustomer(customer);
        return ResponseEntity.ok(getCustomer);
    }

    @PutMapping
    public ResponseEntity<GetCustomerOutputDTO> update(@RequestBody @Valid UpdateCustomerInputDTO dto) {
        Customer updatedCustomer = controllerMapper.updateToEntity(dto);
        updatedCustomer = updateCustomer.update(updatedCustomer, dto.getZipCode());
        return ResponseEntity.ok(controllerMapper.entityToGetCustomer(updatedCustomer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@RequestParam String id) {
        deleteCustomer.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
