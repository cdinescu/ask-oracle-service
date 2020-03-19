package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Magnesium;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface MagnesiumRepository extends ReactiveMongoRepository<Magnesium, String> {

    Flux<Magnesium> findByOrderByQuantityDesc(Pageable pageable);
}
