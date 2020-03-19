package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Iron;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface IronRepository extends ReactiveMongoRepository<Iron, String> {

    Flux<Iron> findByOrderByQuantityDesc(Pageable pageable);
}
