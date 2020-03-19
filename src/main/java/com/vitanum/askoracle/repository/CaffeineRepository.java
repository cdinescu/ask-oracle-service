package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Caffeine;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CaffeineRepository extends ReactiveMongoRepository<Caffeine, String> {

    Flux<Caffeine> findByOrderByQuantityDesc(Pageable pageable);
}
