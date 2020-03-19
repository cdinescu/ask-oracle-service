package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Riboflavin;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface RiboflavinRepository extends ReactiveMongoRepository<Riboflavin, String> {

    Flux<Riboflavin> findByOrderByQuantityDesc(Pageable pageable);
}
