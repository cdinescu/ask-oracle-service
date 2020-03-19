package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Leucine;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface LeucineRepository extends ReactiveMongoRepository<Leucine, String> {

    Flux<Leucine> findByOrderByQuantityDesc(Pageable pageable);
}
