package com.train.msscbrewery.web.services;

import com.train.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
