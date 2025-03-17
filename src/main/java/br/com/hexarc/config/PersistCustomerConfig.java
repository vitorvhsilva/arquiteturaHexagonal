package br.com.hexarc.config;

import br.com.hexarc.application.core.usecase.PersistCustomerUseCase;
import br.com.hexarc.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.hexarc.application.ports.out.PersistCustomerOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistCustomerConfig {
    @Bean
    public PersistCustomerUseCase persistCustomerUseCase(
        FindAddressByZipCodeOutputPort findAddress,
        PersistCustomerOutputPort persistCostumer
    ){
        return new PersistCustomerUseCase(findAddress, persistCostumer);
    }
}
