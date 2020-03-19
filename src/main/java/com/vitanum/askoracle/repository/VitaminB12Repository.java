package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.VitaminB12;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface VitaminB12Repository extends ReactiveMongoRepository<VitaminB12, String> {

    Flux<VitaminB12> findByOrderByQuantityDesc(Pageable pageable);
}
