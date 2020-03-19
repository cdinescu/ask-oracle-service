package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.TotalSugar;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface TotalSugarRepository extends ReactiveMongoRepository<TotalSugar, String> {

    Flux<TotalSugar> findByOrderByQuantityDesc(Pageable pageable);
}
