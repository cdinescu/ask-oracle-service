package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.VitaminE;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface VitaminERepository extends ReactiveMongoRepository<VitaminE, String> {

    Flux<VitaminE> findByOrderByQuantityDesc(Pageable pageable);
}
