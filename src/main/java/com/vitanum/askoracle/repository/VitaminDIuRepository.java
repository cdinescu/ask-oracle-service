package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.VitaminDIu;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface VitaminDIuRepository extends ReactiveMongoRepository<VitaminDIu, String> {

    Flux<VitaminDIu> findByOrderByQuantityDesc(Pageable pageable);
}
