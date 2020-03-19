package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.VitaminK;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface VitaminKRepository extends ReactiveMongoRepository<VitaminK, String> {

    Flux<VitaminK> findByOrderByQuantityDesc(Pageable pageable);
}
