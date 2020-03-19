package com.vitanum.askoracle.repository;

import com.vitanum.askoracle.entity.PantothenicAcid;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface PantothenicAcidRepository extends ReactiveMongoRepository<PantothenicAcid, String> {

    Flux<PantothenicAcid> findByOrderByQuantityDesc(Pageable pageable);
}
