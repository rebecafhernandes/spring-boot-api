package br.com.springbootapi.service;

import br.com.springbootapi.model.Offer;
import br.com.springbootapi.model.dto.OfferDTO;
import br.com.springbootapi.repository.OfferRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<OfferDTO> getAll() {
        List<Offer> offers = offerRepository.findAll();
        return offers.stream().map(offer -> modelMapper.map(offer, OfferDTO.class)).collect(Collectors.toList());
    }

    public OfferDTO getOfferById(Long id) {
        Optional<Offer> offer = offerRepository.findById(id);
        return modelMapper.map(offer.get(), OfferDTO.class);
    }



}
