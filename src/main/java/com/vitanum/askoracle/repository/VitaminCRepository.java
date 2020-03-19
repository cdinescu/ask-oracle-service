package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.VitaminC;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface VitaminCRepository extends ReactiveMongoRepository<VitaminC, String> {

    Flux<VitaminC> findByOrderByQuantityDesc(Pageable pageable);
}
