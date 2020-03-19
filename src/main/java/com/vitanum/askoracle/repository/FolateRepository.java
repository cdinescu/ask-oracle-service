package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.Folate;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface FolateRepository extends ReactiveMongoRepository<Folate, String> {

    Flux<Folate> findByOrderByQuantityDesc(Pageable pageable);
}
