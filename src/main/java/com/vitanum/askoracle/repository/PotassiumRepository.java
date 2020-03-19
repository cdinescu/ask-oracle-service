package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Potassium;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface PotassiumRepository extends ReactiveMongoRepository<Potassium, String> {

    Flux<Potassium> findByOrderByQuantityDesc(Pageable pageable);
}
