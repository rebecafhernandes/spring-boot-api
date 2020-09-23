package br.com.springbootapi.controller;

import br.com.springbootapi.model.dto.OfferDTO;
import br.com.springbootapi.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/offer")
public class OfferController {

    @Autowired
    private OfferService offerService;

    @GetMapping
    public ResponseEntity<List<OfferDTO>> getAll() {
        List<OfferDTO> offerDTOS = offerService.getAll();
        return ResponseEntity.ok(offerDTOS);
    }

}
