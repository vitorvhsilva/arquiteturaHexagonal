package br.com.hexarc.config;

import br.com.hexarc.application.core.usecase.DeleteCustomerUseCase;
import br.com.hexarc.application.ports.out.DeleteCustomerOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {
    @Bean
    public DeleteCustomerUseCase deleteCustomerUseCase(
            DeleteCustomerOutputPort deleteCustomer
    ){
        return new DeleteCustomerUseCase(deleteCustomer);
    }
}
