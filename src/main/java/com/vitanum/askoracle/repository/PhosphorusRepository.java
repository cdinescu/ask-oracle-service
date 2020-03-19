package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Phosphorus;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface PhosphorusRepository extends ReactiveMongoRepository<Phosphorus, String> {

    Flux<Phosphorus> findByOrderByQuantityDesc(Pageable pageable);
}
