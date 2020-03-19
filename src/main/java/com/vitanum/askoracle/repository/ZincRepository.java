package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Zinc;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface ZincRepository extends ReactiveMongoRepository<Zinc, String> {

    Flux<Zinc> findByOrderByQuantityDesc(Pageable pageable);
}
