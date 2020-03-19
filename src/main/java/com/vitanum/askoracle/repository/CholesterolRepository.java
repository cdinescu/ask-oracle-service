package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Cholesterol;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CholesterolRepository extends ReactiveMongoRepository<Cholesterol, String> {

    Flux<Cholesterol> findByOrderByQuantityDesc(Pageable pageable);
}
