package br.com.hexarc.config;

import br.com.hexarc.application.core.usecase.GetCustomerByIdUseCase;
import br.com.hexarc.application.ports.out.GetCustomerByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetCustomerByIdConfig {
    @Bean
    public GetCustomerByIdUseCase getCustomerByIdUseCase(
        GetCustomerByIdOutputPort getCustomerById
    ){
        return new GetCustomerByIdUseCase(getCustomerById);
    }
}
