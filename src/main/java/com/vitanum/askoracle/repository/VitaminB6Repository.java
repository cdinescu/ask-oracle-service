package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.VitaminB6;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface VitaminB6Repository extends ReactiveMongoRepository<VitaminB6, String> {

    Flux<VitaminB6> findByOrderByQuantityDesc(Pageable pageable);
}
