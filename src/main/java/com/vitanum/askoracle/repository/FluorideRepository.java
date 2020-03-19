package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Fluoride;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface FluorideRepository extends ReactiveMongoRepository<Fluoride, String> {

    Flux<Fluoride> findByOrderByQuantityDesc(Pageable pageable);
}
