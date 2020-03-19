package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Selenium;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface SeleniumRepository extends ReactiveMongoRepository<Selenium, String> {

    Flux<Selenium> findByOrderByQuantityDesc(Pageable pageable);
}
