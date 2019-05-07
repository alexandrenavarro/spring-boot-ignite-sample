package com.github.alexandrenavarro.springbootignitesample.config;

import com.github.alexandrenavarro.springbootignitesample.dto.Price;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IgniteConf {


    @Bean
    public Ignite igniteInstance() {
        IgniteConfiguration config = new IgniteConfiguration();
        //config.setPeerClassLoadingEnabled(true);
        config.setIgniteInstanceName("ignite-cluster-node");
        CacheConfiguration priceCache = new CacheConfiguration("PriceCache");
        priceCache.setIndexedTypes(Long.class, Price.class);
        config.setCacheConfiguration(priceCache);
        //IgniteLogger log = new Slf4jLogger();
        //config.setGridLogger(log);
        return Ignition.start(config);
    }

    @Bean
    public String test() {
        return "test";
    }
}
