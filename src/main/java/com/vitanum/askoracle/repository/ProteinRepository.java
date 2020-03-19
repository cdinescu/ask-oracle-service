package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Protein;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface ProteinRepository extends ReactiveMongoRepository<Protein, String> {

    Flux<Protein> findByOrderByQuantityDesc(Pageable pageable);
}
