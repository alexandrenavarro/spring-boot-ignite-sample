package com.github.alexandrenavarro.springbootignitesample.repository;

import com.github.alexandrenavarro.springbootignitesample.dto.Price;
import org.apache.ignite.springdata20.repository.IgniteRepository;
import org.apache.ignite.springdata20.repository.config.RepositoryConfig;

import java.util.List;

@RepositoryConfig(cacheName = "PriceCache")
public interface PriceRepository extends IgniteRepository<Price, Long> {

    // Does not work, to investigate why
    //public List<Price> findByCode(String code);

}
