package br.com.springbootapi.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OfferDTO {
    private String offerName;
    private LocalDateTime offerCreationDate;
    private LocalDateTime offerExpirationDate;
    private String customerName;
    private String customerCity;
}
