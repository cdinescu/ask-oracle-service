package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Niacin;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface NiacinRepository extends ReactiveMongoRepository<Niacin, String> {

    Flux<Niacin> findByOrderByQuantityDesc(Pageable pageable);
}
