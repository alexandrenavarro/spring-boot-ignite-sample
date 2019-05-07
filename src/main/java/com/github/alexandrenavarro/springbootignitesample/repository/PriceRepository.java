package com.github.alexandrenavarro.springbootignitesample.repository;

import com.github.alexandrenavarro.springbootignitesample.dto.Price;
import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;

@RepositoryConfig(cacheName = "PriceCache")
public interface PriceRepository  extends IgniteRepository<Price, Long> {

    Price getPriceByCode(String code);
}
