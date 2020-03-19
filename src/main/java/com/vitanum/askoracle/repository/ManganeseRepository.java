package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Manganese;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface ManganeseRepository extends ReactiveMongoRepository<Manganese, String> {

    Flux<Manganese> findByOrderByQuantityDesc(Pageable pageable);
}
