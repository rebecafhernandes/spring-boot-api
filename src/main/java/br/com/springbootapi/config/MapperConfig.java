package br.com.springbootapi.config;

import br.com.springbootapi.model.Offer;
import br.com.springbootapi.model.dto.OfferDTO;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.typeMap(Offer.class, OfferDTO.class).addMapping(src -> src.getCustomer().getAddress().getCity(), OfferDTO::setCustomerCity);
        return modelMapper;
    }

}
