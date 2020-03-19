package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Epa;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface EpaRepository extends ReactiveMongoRepository<Epa, String> {

    Flux<Epa> findByOrderByQuantityDesc(Pageable pageable);
}
