package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.VitaminD2;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface VitaminD2Repository extends ReactiveMongoRepository<VitaminD2, String> {

    Flux<VitaminD2> findByOrderByQuantityDesc(Pageable pageable);
}
