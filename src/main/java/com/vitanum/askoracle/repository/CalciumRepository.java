package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Calcium;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CalciumRepository extends ReactiveMongoRepository<Calcium, String> {

    Flux<Calcium> findByOrderByQuantityDesc(Pageable pageable);
}
