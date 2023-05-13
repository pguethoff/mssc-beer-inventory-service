package com.pguethoff.web.mappers;

import com.pguethoff.domain.BeerInventory;
import com.pguethoff.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

/**
 * Created by pgue on 2023-05-31.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
