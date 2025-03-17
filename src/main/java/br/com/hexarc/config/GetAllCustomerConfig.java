package br.com.hexarc.config;

import br.com.hexarc.application.core.usecase.GetAllCustomerUseCase;
import br.com.hexarc.application.core.usecase.PersistCustomerUseCase;
import br.com.hexarc.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.hexarc.application.ports.out.GetAllCustomerOutputPort;
import br.com.hexarc.application.ports.out.PersistCustomerOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetAllCustomerConfig {
    @Bean
    public GetAllCustomerUseCase getAllCustomerUseCase(
        GetAllCustomerOutputPort getAllCustomer
    ){
        return new GetAllCustomerUseCase(getAllCustomer);
    }
}
