package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Sodium;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface SodiumRepository extends ReactiveMongoRepository<Sodium, String> {

    Flux<Sodium> findByOrderByQuantityDesc(Pageable pageable);
}
