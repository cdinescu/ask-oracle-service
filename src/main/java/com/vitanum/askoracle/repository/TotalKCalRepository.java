package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.TotalKCal;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface TotalKCalRepository extends ReactiveMongoRepository<TotalKCal, String> {

    Flux<TotalKCal> findByOrderByQuantityDesc(Pageable pageable);
}
