package com.train.msscbrewery.web.services;

import com.train.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Abc").beerStyle("New").build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).
                beerStyle(beerDto.getBeerStyle()).
                beerName(beerDto.getBeerName()).
                upc(beerDto.getUpc()).build();
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleted beer:"+beerId);
    }
}
