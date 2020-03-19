package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Carbohydrate;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CarbohydrateRepository extends ReactiveMongoRepository<Carbohydrate, String> {

    Flux<Carbohydrate> findByOrderByQuantityDesc(Pageable pageable);
}
