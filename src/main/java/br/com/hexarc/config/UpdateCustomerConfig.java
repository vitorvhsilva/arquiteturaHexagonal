package br.com.hexarc.config;

import br.com.hexarc.application.core.usecase.UpdateCustomerUseCase;
import br.com.hexarc.application.ports.in.GetCustomerByIdInputPort;
import br.com.hexarc.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.hexarc.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {
    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            GetCustomerByIdInputPort getCustomerById,
            FindAddressByZipCodeOutputPort findAddress,
            UpdateCustomerOutputPort updateCustomer
    ) {
        return new UpdateCustomerUseCase(getCustomerById, findAddress, updateCustomer);
    }
}
