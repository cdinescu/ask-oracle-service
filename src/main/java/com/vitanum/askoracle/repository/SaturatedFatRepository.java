package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.SaturatedFat;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface SaturatedFatRepository extends ReactiveMongoRepository<SaturatedFat, String> {

    Flux<SaturatedFat> findByOrderByQuantityDesc(Pageable pageable);
}
