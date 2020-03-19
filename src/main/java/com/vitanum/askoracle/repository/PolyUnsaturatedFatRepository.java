package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.PolyUnsaturatedFat;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface PolyUnsaturatedFatRepository extends ReactiveMongoRepository<PolyUnsaturatedFat, String> {

    Flux<PolyUnsaturatedFat> findByOrderByQuantityDesc(Pageable pageable);
}
